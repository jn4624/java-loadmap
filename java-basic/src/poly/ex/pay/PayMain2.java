package poly.ex.pay;

import java.util.Scanner;

/**
 * 결제 시스템 개발 - 사용자 입력 문제 풀이
 */
public class PayMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();

            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            payService.processPay(option, amount);
        }
    }
}
