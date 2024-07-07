package method.ex;

/**
 * - 메서드 사용 코드 리팩토링
 */
public class MethodEx1 {
    public static void main(String[] args) {
        System.out.println("평균값 = " + average(1, 2, 3));
        System.out.println("평균값 = " + average(15, 25, 35));
    }

    private static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }

    /*public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);

        int x = 15;
        int y = 25;
        int z = 35;
        sum = x + y + z;
        average = sum / 3.0;
        System.out.println("평균값: " + average);
    }*/
}
