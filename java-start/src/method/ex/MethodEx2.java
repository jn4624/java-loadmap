package method.ex;

/**
 * - 메서드 사용 코드 리팩토링
 */
public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        print(message, 3);
        print(message, 5);
        print(message, 7);
    }

    private static void print(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    /*public static void main(String[] args) {
        String message = "Hello, world!";

        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println(message);
        }
    }*/
}
