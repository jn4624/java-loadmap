package scanner.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 하나의 정수 n 을 입력 받고, 입력 받은 정수 n 의 구구단을 출력하는 프로그램 작성
 */
public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요 = ");
        int n = scanner.nextInt();

        System.out.println(n + "단의 구구단");

        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
