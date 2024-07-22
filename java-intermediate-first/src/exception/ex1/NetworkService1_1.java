package exception.ex1;

public class NetworkService1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient1 client = new NetworkClient1(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
