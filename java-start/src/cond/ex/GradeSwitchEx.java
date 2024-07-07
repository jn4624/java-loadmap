package cond.ex;

/**
 * - String grade 문자열 선언, 학점에 따라 성취도를 출력하는 프로그램을 작성
 * - "A": "탁월한 성과입니다!"
 * - "B": "좋은 성과입니다!"
 * - "C": "준수한 성과입니다!"
 * - "D": "향상이 필요합니다."
 * - "F": "불합격입니다."
 * - 나머지: "잘못된 학점입니다."
 * - switch 문 활용
 */
public class GradeSwitchEx {
    public static void main(String[] args) {
//        String grade = "B";
//        String grade = "A";
        String grade = "F";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
