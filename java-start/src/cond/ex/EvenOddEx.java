package cond.ex;

/**
 * - 정수 x 가 짝수이면 "짝수", 홀수이면 "홀수"를 출력하는 프로그램을 작성
 * - 삼항 연산자 활용
 */
public class EvenOddEx {
    public static void main(String[] args) {
//        int x = 2;
        int x = 3;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x = " + x + ", " + result);
    }
}
