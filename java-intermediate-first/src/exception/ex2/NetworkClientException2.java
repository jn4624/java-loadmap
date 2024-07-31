package exception.ex2;

public class NetworkClientException2 extends Exception {
    private String errorCode;

    public NetworkClientException2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
