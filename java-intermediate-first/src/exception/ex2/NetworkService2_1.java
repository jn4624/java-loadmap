package exception.ex2;

public class NetworkService2_1 {
    public void sendMessage(String data) throws NetworkClientException2 {
        String address = "https://example.com";

        NetworkClient2 client = new NetworkClient2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
