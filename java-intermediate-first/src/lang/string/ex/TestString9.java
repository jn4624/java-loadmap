package lang.string.ex;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        // split()을 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
        String[] split = email.split("@");
        System.out.println("ID: " + split[0]);
        System.out.println("Domain: " + split[1]);
    }
}
