package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numStr = String.valueOf(num);
        System.out.println("숫자의 문자열 값: " + numStr);

        String boolStr = String.valueOf(bool);
        System.out.println("불리언의 문자열 값: " + boolStr);

        String objStr = String.valueOf(obj);
        System.out.println("객체의 문자열 값: " + objStr);

        // 다음과 같이 간단히 변환할 수 있음 (문자 + x -> 문자x)
        String numStr2 = "" + num;
        System.out.println("빈문자열 + num: " + numStr2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
