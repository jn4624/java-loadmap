package lang.string.ex;

public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";

        // replace()를 사용해서 java 라는 단어를 jvm 으로 변경해라.
        String result = input.replace("java", "jvm");
        System.out.println(result);
    }
}
