package ss3_array_and_method;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type number of integer array elements (max 20): ");
        int number = scanner.nextInt();

        do {
            if (number > 20 || number < 1) {
                System.out.print("Invalid input. Type again: ");
                number = scanner.nextInt();
            }
        } while(number > 20 || number < 1);

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.printf("Type element index %d: ", i);
            array[i] = scanner.nextInt();
        }

        for (int i = 0, j = number - 1; j >= i; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int i = 0; i < number; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
