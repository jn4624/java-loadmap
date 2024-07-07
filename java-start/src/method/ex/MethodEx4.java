package method.ex;

import java.util.Scanner;

/**
 *  ---------------------------------
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
 *  ---------------------------------
 * 선택: 1
 * 입금액을 입력하세요: 10000
 * 10000원을 입금하였습니다. 현재 잔액: 10000원
 *
 *  ---------------------------------
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
 *  ---------------------------------
 * 선택: 2
 * 출금액을 입력하세요: 8000
 * 8000원을 출금하였습니다. 현재 잔액: 2000원
 *
 *  ---------------------------------
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
 *  ---------------------------------
 * 선택: 2
 * 출금액을 입력하세요: 3000
 * 3000원을 출금하려 했으나 잔액이 부족합니다.
 *
 *  ---------------------------------
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
 *  ---------------------------------
 * 선택: 3
 * 현재 잔액: 2000원
 *
 *  ---------------------------------
 * 1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
 *  ---------------------------------
 * 선택: 4
 * 시스템을 종료합니다.
 */
public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 0;

        while (true) {
            printHeader();
            int input = scan.nextInt();
            int amount;

            if (input == 1) {
                System.out.print("입금액을 입력하세요 = ");
                amount = scan.nextInt();
                balance = deposit(balance, amount);
            } else if (input == 2) {
                System.out.print("출금액을 입력하세요 = ");
                amount = scan.nextInt();
                balance = withdraw(balance, amount);
            } else if (input == 3) {
                System.out.println("현재 잔액 = " + balance + "원");
            } else if (input == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
            }
        }
    }

    private static int withdraw(int balance, int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액 = " + balance + "원");
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

    private static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 = " + balance + "원");
        return balance;
    }

    private static void printHeader() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
        System.out.print("선택 = ");
    }
}
