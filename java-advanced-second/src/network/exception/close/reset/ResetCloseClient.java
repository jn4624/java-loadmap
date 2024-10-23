package network.exception.close.reset;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

import static util.MyLogger.log;

public class ResetCloseClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 12345);
        log("소켓 연결: " + socket);

        InputStream input = socket.getInputStream();
        OutputStream output = socket.getOutputStream();

        // client <- server: FIN
        Thread.sleep(1000); // 서버가 close() 호출할 때까지 잠시 대기

        // client -> server: PUSH[1]
        output.write(1);

        // client <- server: RST
        Thread.sleep(1000); // RST 메시지 전송 대기

        /*
          참고 - RST(Reset)
          - TCP 에서 RST 패킷은 연결 상태를 초기화(리셋)해서 더 이상 현재의 연결을 유지하지 않겠다는 의미를 전달한다.
          - 여기서 Reset 은 현재의 세션을 강제로 종료하고, 연결을 무효화하라는 뜻이다.
          - RST 패킷은 TCP 연결에 문제가 있는 다양한 상황에서 발생한다.
            * TCP 스펙에 맞지 않는 순서로 메시지가 전달될 때
            * TCP 버퍼에 있는 데이터를 아직 다 읽지 않았는데, 연결이 종료될 때
            * 방화벽 같은 곳에서 연결을 강제로 종료할 때

          참고 - java.net.SocketException: Socket is closed
          - 자기 자신의 소켓을 닫은 이후에 read(), write()를 호출할 때 발생
         */
        try {
            // java.net.SocketException: Connection reset 발생
            int read = input.read();
            log("read: " + read);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        try {
            output.write(1);
        } catch (SocketException e) {
            // java.net.SocketException: Broken pipe
            e.printStackTrace();
        }
    }
}
