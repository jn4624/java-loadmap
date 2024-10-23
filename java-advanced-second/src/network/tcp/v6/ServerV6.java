package network.tcp.v6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ServerV6 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("서버 시작");

        SessionManagerV6 sessionManager = new SessionManagerV6();
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트: " + PORT);

        // ShutdownHook 등록
        ShutdownHook shutdownHook = new ShutdownHook(serverSocket, sessionManager);
        /*
          Runtime.getRuntime().addShutdownHook()을 사용하면 자바 종료시 호출되는 셧다운 훅을 등록할 수 있다.
          여기에 셧다운이 발생했을 때 처리할 작업과 스레드를 등록하면 된다.
         */
        Runtime.getRuntime().addShutdownHook(new Thread(shutdownHook, "shutdown"));

        try {
            while (true) {
                Socket socket = serverSocket.accept(); // 블로킹
                log("소켓 연결: " + socket);

                SessionV6 session = new SessionV6(socket, sessionManager);
                Thread thread = new Thread(session);
                thread.start();
            }
        } catch (IOException e) {
            log("서버 소켓 종료: " + e);
        }
    }

    static class ShutdownHook implements Runnable {
        private final ServerSocket serverSocket;
        private final SessionManagerV6 sessionManager;

        public ShutdownHook(ServerSocket serverSocket, SessionManagerV6 sessionManager) {
            this.serverSocket = serverSocket;
            this.sessionManager = sessionManager;
        }

        @Override
        public void run() {
            log("shutdownHook 실행");

            try {
                sessionManager.closeAll();
                serverSocket.close();

                /*
                  자원 정리 대기 이유
                  보통 모든 non 데몬 스레드의 실행이 완료되면 자바 프로세스가 정상 종료된다. 하지만 다음과 같은 종료도 있다.
                    - 사용자가 Ctrl + C 를 눌러서 프로그램을 중단
                    - kill 명령 전달 (kill -9 제외)
                    - IntelliJ 의 stop 버튼 클릭
                  이런 경우에는 non 데몬 스레드의 종료 여부와 관계 없이 자바 프로세스가 종료된다.
                  단, ShutdownHook 의 실행이 끝날 때까지는 기다려준다.
                  ShutdownHook 의 실행이 끝나면 non 데몬 스레드의 실행 여부와 상관 없이 자바 프로세스는 종료된다.
                  따라서 다른 스레드가 자원을 정리하거나 필요한 로그를 남길 수 있도록 ShutdownHook 의 실행을 잠시 대기한다.
                 */
                Thread.sleep(1000); // 자원 정리 대기
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("e: " + e);
            }
        }
    }
}
