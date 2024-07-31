package exception.ex4;

public class NetworkService5 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        try (NetworkClient5 client = new NetworkClient5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
