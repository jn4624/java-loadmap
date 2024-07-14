package lang.string.ex;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";

        /**
         * substring()을 사용해서, hello 부분과 .txt 부분을 분리해라.
         * 단순하게 substring()에 숫자를 직접 입력해서 문제를 풀면 된다.
         */
        String fileName = str.substring(0, str.indexOf(".txt"));
        String extName = str.substring(str.indexOf(".txt"), str.length());

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
