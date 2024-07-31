package exception.ex3.exception;

public class ConnectException3 extends NetworkClientException3 {
    private final String address;

    public ConnectException3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
