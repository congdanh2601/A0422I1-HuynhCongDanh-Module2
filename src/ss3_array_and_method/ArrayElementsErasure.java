package ss3_array_and_method;

import java.util.Scanner;

public class ArrayElementsErasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number(s) of elements in array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Type element index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Type number you want to remove from array: ");
        int X = scanner.nextInt();

        while (checkPresenceInArray(X, array)) {
            deleteElement(X, array);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static boolean checkPresenceInArray(int X, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                return true;
            }
        }
        return false;
    }

    public static void deleteElement(int X, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                for (int j = i; j < array.length; j++) {
                    if (j == array.length - 1) {
                        array[j] = 0;
                    } else {
                        array[j] = array[j + 1];
                    }
                }
            }
        }
    }
}
