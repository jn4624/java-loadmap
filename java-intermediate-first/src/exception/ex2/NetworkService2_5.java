package exception.ex2;

public class NetworkService2_5 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClient2 client = new NetworkClient2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientException2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
