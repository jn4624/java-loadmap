package scanner.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 음식의 이름(foodName), 가격(foodPrice), 수량(foodQuantity)을 입력 받아,
 *   주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성
 * - 음식의 총 가격을 계산, 총 가격은 각 음식의 가격과 수량을 곱한 값, 이를 totalPrice 변수에 저장
 * - 주문 정보와 총 가격을 출력, 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]원 입니다."
 */
public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 = ");
        String foodName = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요 = ");
        int foodPrice = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요 = ");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하였습니다. 총 가격은 " + totalPrice + "원입니다.");
    }
}
