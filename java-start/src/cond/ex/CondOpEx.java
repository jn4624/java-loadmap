package cond.ex;

/**
 * - 두 개의 정수 변수 a 와 b 선언
 * - a 의 값은 10, b 의 값은 20
 * - 삼항연산자를 활용하여 두 숫자 중 더 큰 숫자를 출력
 */
public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = (a > b) ? a : b;
        System.out.println("더 큰 숫자는 " + result + "입니다.");
    }
}
