package ss1_introduction_to_java;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        String text = scanner.nextLine();
        int number = Integer.parseInt(text);
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] texts1 = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] texts2;
        System.out.println();

        if (number < 0) {
            System.out.println("You just entered a negative number");
        } else if (number < 10) {
            System.out.println(texts1[findIndex(number, numbers)]);
        } else if (number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                case 20:
                    System.out.println("twenty");
                    break;
            }
        }
    }
    public static int findIndex(int number, int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }
}
