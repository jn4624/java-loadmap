package array.ex;

import java.util.Scanner;

/**
 * - 사용자에게 5개의 정수를 입력 받아 배열에 저장, 입력받은 순서의 역순으로 출력
 * - 출력 포멧은 5,4,3,2,1과 같이 `,` 쉼표를 사용해서 구분
 */
public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = (arr.length -1); i >= 0; i--) {
            if (i < (arr.length -1)) {
                System.out.print(", ");
            }

            System.out.print(arr[i]);
        }
    }
}
