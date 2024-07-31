package exception.ex4.exception;

public class SendException4 extends NetworkClientException4 {
    private final String sendData;

    public SendException4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
