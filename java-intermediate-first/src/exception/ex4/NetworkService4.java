package exception.ex4;

public class NetworkService4 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClient4 client = new NetworkClient4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
