package array.ex;

import java.util.Scanner;

/**
 * - 사용자에게 5개의 정수를 입력 받아서 합계와 평균을 계산하는 프로그램 작성
 */
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 받을 숫자의 개수를 입력하세요 = ");
        int length = scanner.nextInt();

        int[] arr = new int[length];

        System.out.println(length + "개의 정수를 입력하세요");

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int number : arr) {
            sum += number;
        }

        double average = (double) sum / arr.length;

        System.out.println("입력한 정수의 합계 = " + sum);
        System.out.println("입력한 정수의 평균 = " + average);
    }
}
