package exception.ex0;

public class NetworkClient0 {
    private final String address;

    public NetworkClient0(String address) {
        this.address = address;
    }

    public String connect() {
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
}
