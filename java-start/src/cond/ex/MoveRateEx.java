package cond.ex;

/**
 * - 요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성
 * - 어바웃타임 - 평점 9
 * - 토이스토리 - 평점 8
 * - 고질라 - 평점 7
 * - 평점 변수는 double rating 사용
 * - if 문 활용
 */
public class MoveRateEx {
    public static void main(String[] args) {
//        double rating = 9;
//        double rating = 8;
//        double rating = 7.1;
        double rating = 7;

        if (rating <= 9) {
            System.out.println("어바웃타임을 추천합니다.");
        }
        if (rating <= 8) {
            System.out.println("토이스토리를 추천합니다.");
        }
        if (rating <= 7) {
            System.out.println("고질라를 추천합니다.");
        }
    }
}
