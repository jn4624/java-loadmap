package loop.ex;

/**
 * - 10개의 짝수를 출력하는 프로그램을 작성
 * - num 변수 사용
 * - while, for 2가지 버전
 */
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
