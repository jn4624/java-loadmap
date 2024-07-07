package cond.ex;

/**
 * - 학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성
 * - 90점 이상: "A"
 * - 80점 이상 90점 미만: "B"
 * - 70점 이상 80점 미만: "C"
 * - 60점 이상 70점 미만: "D"
 * - 60점 미만: "F"
 */
public class ScoreEx {
    public static void main(String[] args) {
//        int score = 95;
//        int score = 85;
//        int score = 75;
//        int score = 65;
        int score = 55;

        if (score >= 90) {
            System.out.println("학점은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D 입니다.");
        } else {
            System.out.println("학점은 F 입니다.");
        }
    }
}
