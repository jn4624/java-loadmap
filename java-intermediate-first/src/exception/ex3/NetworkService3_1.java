package exception.ex3;

import exception.ex3.exception.ConnectException3;
import exception.ex3.exception.SendException3;

public class NetworkService3_1 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClient3 client = new NetworkClient3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectException3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (SendException3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
