package exception.ex2;

public class NetworkClient2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClient2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientException2 {
        if (connectError) {
            throw new NetworkClientException2("connectError", address + " 서버 연결 실패");
        }

        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkClientException2 {
        if (sendError) {
            throw new NetworkClientException2("sendError", address + " 서버에 데이터 전송 실패: " + data);
            // 새로 등장한 RuntimeException은 NetworkService에서 잡을 수 없는 문제 발생
//            throw new RuntimeException("ex");
        }

        // 전송 성공
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
