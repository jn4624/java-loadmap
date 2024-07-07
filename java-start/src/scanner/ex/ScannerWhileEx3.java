package scanner.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램 작성
 * - 사용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료
 * - 모든 숫자의 입력이 끝난 후, 숫자들의 합계 sum 과 평균 average 를 출력
 * - 평균은 소수점 아래까지 계산
 */
public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int number;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 = ");

        while (true) {
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            sum += number;
            count++;
        }

        System.out.println("입력한 숫자들의 합계 = " + sum);

        double average = (double) sum / count;
        System.out.println("입력한 숫자들이 평균 = " + average);
    }
}
