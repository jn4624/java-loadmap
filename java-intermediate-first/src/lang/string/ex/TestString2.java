package lang.string.ex;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        // length()를 사용해서 arr 배열에 있는 모든 문자열의 길이의 합을 구해라.
        int sum = 0;
        for (String str : arr) {
            System.out.println(str + ": " + str.length());
            sum += str.length();
        }
        System.out.println("sum = " + sum);
    }
}
