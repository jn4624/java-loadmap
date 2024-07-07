package array.ex;

import java.util.Scanner;

/**
 * - 사용자에게 5개의 정수를 입력 받아서 합계와 평균을 계산하는 프로그램 작성
 */
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요");

        for (int i = 0; i < arr.length; i++) {
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
