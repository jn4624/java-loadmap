package network.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class ConnectTimeoutMain1 {
    /*
      Windows: 약 21초
      Linux: 약 75초에서 180초 사이, mac test 75초
     */
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        try {
            Socket socket = new Socket("192.168.1.250", 45678);
        } catch (ConnectException e) {
            // ConnectException: Operation timed out
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken = " + (endTime - startTime));
    }
}
