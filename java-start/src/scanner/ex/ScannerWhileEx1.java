package scanner.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 이름과 나이를 반복해서 입력 받고, 입력 받은 이름과 나이를 출력하는 프로그램 작성
 * - 사용자가 "종료"를 입력하면 프로그램 종료
 */
public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 프로그램 종료) = ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.print("나이를 입력하세요 = ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름 = " + name + " 입력한 나이 = " + age);
        }
    }
}
