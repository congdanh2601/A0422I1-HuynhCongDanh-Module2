package ss15_exception_debug.p2_random_100;

import java.util.Scanner;

public class TestArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] randomIntArray = new int[100];

        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = (int) (Math.random() * 100 + 1);
            System.out.print(randomIntArray[i] + "\t");
        }

        System.out.print("\nType an index: ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();

        while (true) {
            try {
                System.out.println("Value at index " + index + " is " + randomIntArray[index]);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid index");
            }
            System.out.print("\nType an index: ");
            index = scanner.nextInt();
        }
    }
}
