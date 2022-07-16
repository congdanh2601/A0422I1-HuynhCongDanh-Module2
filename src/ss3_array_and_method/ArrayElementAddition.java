package ss3_array_and_method;

import java.util.Scanner;

public class ArrayElementAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number(s) of elements in array: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Type element index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Type number you want to add to array: ");
        int X = scanner.nextInt();

        System.out.print("Type index you want to add " + X + " to: ");
        int index = scanner.nextInt();

        addElement(X, index, array);

        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    public static void addElement(int X, int index, int[] array) {
        for (int i = array.length - 1; i >= index; i--) {
            if (i == index) {
                array[i] = X;
            } else {
                array[i] = array[i - 1];
            }
        }
    }
}
