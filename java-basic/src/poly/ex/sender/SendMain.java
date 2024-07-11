package poly.ex.sender;

/**
 * 다중 메시지 발송 문제 풀이
 */
public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
