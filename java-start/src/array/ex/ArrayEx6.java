package array.ex;

import java.util.Scanner;

/**
 * - 사용자로부터 n개의 정수를 입력 받아 배열에 저장한 후,
 *   배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램 작성
 */
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 = ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println(length + "개의 정수를 입력하세요");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int minNumber = arr[0];
        int maxNumber = arr[0];

        for (int i = 1; i < length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        System.out.println("가장 작은 정수 = " + minNumber);
        System.out.println("가장 큰 정수 = " + maxNumber);
    }
}
