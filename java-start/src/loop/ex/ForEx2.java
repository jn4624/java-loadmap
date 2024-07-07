package loop.ex;

/**
 * - 10개의 짝수를 출력하는 프로그램을 작성
 * - num 변수 사용
 * - while, for 2가지 버전
 */
public class ForEx2 {
    public static void main(String[] args) {
//        int num = 2;
//
//        for (int count = 1; count <= 10; count++) {
//            System.out.println(num);
//            num += 2;
//        }

        for (int count = 1, num = 2; count <= 10; count++, num += 2) {
            System.out.println(num);
        }
    }
}
