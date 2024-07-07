package operator.ex;

/**
 * - num1, num2, num3 int 형 변수 선언, 각 10, 20, 30 초기화
 * - 세 변수의 합 계산, 그 결과를 int 형 sum 변수에 저장
 * - 세 변수의 평균 계산, 그 결과를 int 형 average 변수에 저장, 평균 계산시 소수점 이하 결과 버림
 * - sum 과 average 변수 값 출력
 */
public class OperatorEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
