package lang.string.ex;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        /**
         * str 에는 파일의 이름과 확장자가 주어진다.
         * ext 에는 파일의 확장자가 주어진다.
         * 파일명과 확장자를 분리해서 출력하라.
         * indexOf() 와 substring() 을 사용해서 문제를 풀면 된다.
         */
        int extIndex = str.indexOf(ext);

        String fileName = str.substring(0, extIndex);
        String extName = str.substring(extIndex);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
