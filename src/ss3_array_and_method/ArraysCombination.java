package ss3_array_and_method;

import java.util.Scanner;

public class ArraysCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number(s) of elements in first array: ");
        int length1 = scanner.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.print("Type element index " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Number(s) of elements in second array: ");
        int length2 = scanner.nextInt();
        int[] array2 = new int[length2];
        for (int i = 0; i < length2; i++) {
            System.out.print("Type element index " + i + ": ");
            array2[i] = scanner.nextInt();
        }

        int[] array3 = new int[length1 + length2];

        for (int i = 0; i < length1; i++) {
            array3[i] = array1[i];
        }
        for (int i = length1, j = 0; i < array3.length; i++, j++) {
            array3[i] = array2[j];
        }
        for (int j : array3) {
            System.out.print(j + "\t");
        }
    }
}
