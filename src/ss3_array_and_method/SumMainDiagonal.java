package ss3_array_and_method;

import java.util.Scanner;

public class SumMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Width of the square 2D array: ");
        int x = scanner.nextInt();

        double[][] array = new double[x][x];
        double sum = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf("Type element index %d.%d: ", i, j);
                array[i][j] = scanner.nextDouble();
                if (i == j) {
                    sum += array[i][j];
                    continue;
                }
            }
        }

        System.out.printf("Total of numbers in main diagonal is: %5.1f.", sum);
    }
}
