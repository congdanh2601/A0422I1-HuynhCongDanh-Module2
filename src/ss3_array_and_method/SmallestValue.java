package ss3_array_and_method;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("SIZE of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
                System.out.printf("Type element index %d: ", i);
                array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int i = 0; i < size; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
        }

        System.out.printf("\nSmallest element is %d", min);
    }
}
