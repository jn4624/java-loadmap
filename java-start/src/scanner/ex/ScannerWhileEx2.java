package scanner.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 상품의 가격(price)과 수량(quantity)을 입력 받고, 총 비용을 출력하는 프로그램 작성
 * - 가격과 수량을 입력 받은 후에는 이들의 곱 출력
 * - 출력 형태는 "총 비용: [곱한 결과]"
 * - -1 입력시 프로그램 종료
 */
public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1 입력시 프로그램 종료) = ");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요 = ");
            int quantity = scanner.nextInt();

            int totalPrice = price * quantity;
            System.out.println("총 비용 = " + totalPrice);
        }
    }
}
