package operator.ex;

/**
 * - int 형 변수 score 선언
 * - score 가 80점 이상이고, 100점 이하이면 true 출력, 아니면 false 출력
 */
public class OperatorEx3 {
    public static void main(String[] args) {
        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println("result = " + result);
    }
}
