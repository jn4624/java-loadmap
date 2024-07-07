package operator.ex;

/**
 * - double 형 변수들 선언, 합과 평균 출력
 * - double val1 = 1.5;
 * - double val2 = 2.5;
 * - double val3 = 3.5;
 */
public class OperatorEx2 {
    public static void main(String[] args) {
        double val1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;

        double sum = val1 + var2 + var3;
        double average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
