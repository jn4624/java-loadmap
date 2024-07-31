package exception.ex3;

import exception.ex3.exception.ConnectException3;
import exception.ex3.exception.NetworkClientException3;
import exception.ex3.exception.SendException3;

public class NetworkService3_2 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClient3 client = new NetworkClient3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectException3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientException3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
