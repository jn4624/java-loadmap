package loop.ex;

/**
 * - 처음 10개의 자연수를 출력하는 프로그램을 작성
 * - count 변수 사용
 * - while, for 2가지 버전
 */
public class WhileEx1 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }
}
