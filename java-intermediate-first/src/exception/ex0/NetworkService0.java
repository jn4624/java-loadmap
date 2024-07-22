package exception.ex0;

public class NetworkService0 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClient0 client = new NetworkClient0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
