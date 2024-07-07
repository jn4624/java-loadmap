package scanner.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 두 개의 정수를 입력 받고, 이 두 정수 사이의 모든 정수를 출력하는 프로그램을 작성
 * - 사용자에게 첫 번째 숫자를 입력 받고, num1 변수에 저장
 * - 사용자에게 두 번째 숫자를 입력 받고, num2 변수에 저장
 * - 만약 num1 이 num2 보다 크다면, 두 숫자를 교환
 * - 출력 결과는 2,3,4,5 처럼 `,` 로 구분해서 출력
 */
public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 = ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 = ");
        int num2 = scanner.nextInt();

        System.out.print("두 숫자 사이의 모든 정수는 = ");

        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            if (i > num1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
    }
}
