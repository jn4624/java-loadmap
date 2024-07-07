package array.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력 받아 각 학생의 총점과 평균을 계산하는 프로그램 작성
 * - 2차원 배열 사용
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");

            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("국어 점수 = ");
                } else if (j == 1) {
                    System.out.print("영어 점수 = ");
                } else {
                    System.out.print("수학 점수 = ");
                }

                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int totalScore = 0;

            for (int j = 0; j < 3; j++) {
                totalScore += arr[i][j];
            }

            double average = (double) totalScore / 3;
            System.out.println((i + 1) + "번 학생의 총점 = " + totalScore + ", 평균 = " + average);
        }
    }
}
