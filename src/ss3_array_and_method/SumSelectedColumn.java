package ss3_array_and_method;

import java.util.Scanner;

public class SumSelectedColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height of the 2D array: ");
        int x = scanner.nextInt();

        System.out.print("Width of the 2D array: ");
        int y = scanner.nextInt();

        double[][] array = new double[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Type element index %d.%d: ", i, j);
                array[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Select a column (start from 0) to calculate total of numbers in it: ");
        int column = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < x; i++) {
            sum += array[i][column];
        }

        System.out.printf("Total of numbers in column %d is: %5.1f.", column, sum);
    }
}
