package exception.ex3.exception;

public class SendException3 extends NetworkClientException3 {
    private final String sendData;

    public SendException3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
