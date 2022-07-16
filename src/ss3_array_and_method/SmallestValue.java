package ss3_array_and_method;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height of the 2D array: ");
        int x = scanner.nextInt();

        System.out.print("Width of the 2D array: ");
        int y = scanner.nextInt();

        int[][] array = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Type element index %d.%d: ", i, j);
                array[i][j] = scanner.nextInt();
            }
        }

        int min = array[0][0];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }

        System.out.printf("\nSmallest element is %d", min);
    }
}
