package exception.ex0;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        NetworkService0 networkService = new NetworkService0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");

            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
