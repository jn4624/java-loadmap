package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i = 1;
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
