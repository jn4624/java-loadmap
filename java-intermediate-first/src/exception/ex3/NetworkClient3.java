package exception.ex3;

import exception.ex3.exception.ConnectException3;
import exception.ex3.exception.SendException3;

public class NetworkClient3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClient3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectException3 {
        if (connectError) {
            throw new ConnectException3(address, address + " 서버 연결 실패");
        }

        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendException3 {
        if (sendError) {
            throw new SendException3(data, address + " 서버에 데이터 전송 실패: " + data);
        }

        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
