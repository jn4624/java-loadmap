package lang.string.ex;

public class TestString7 {
    public static void main(String[] args) {
        String original = "    Hello Java  ";

        // 문자의 양쪽 공백을 제거해라.
        String strip = original.strip();
        System.out.println(strip);

        String trim = original.trim();
        System.out.println(trim);
    }
}
