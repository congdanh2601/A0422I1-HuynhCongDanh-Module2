package ss1_introduction_to_java;

import java.util.Scanner;

public class NumberToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer (from 0 to 999) : ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.print("You just entered a negative number!");
        } else if (number < 20) {
            readNumberSmallerThan20(number);
        } else if (number < 100) {
            readNumberSmallerThan100(number);
        } else if (number < 1000) {
            readNumberSmallerThan1000(number);
        } else {
            System.out.print("You just entered a number bigger than 999!");
        }
    }

    public static void readNumberSmallerThan20(int number) {
        switch (number) {
            case 0:
                System.out.print("zero");
                break;
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
            case 10:
                System.out.print("ten");
                break;
            case 11:
                System.out.print("eleven");
                break;
            case 12:
                System.out.print("twelve");
                break;
            case 13:
                System.out.print("thirteen");
                break;
            case 14:
                System.out.print("fourteen");
                break;
            case 15:
                System.out.print("fifteen");
                break;
            case 16:
                System.out.print("sixteen");
                break;
            case 17:
                System.out.print("seventeen");
                break;
            case 18:
                System.out.print("eighteen");
                break;
            case 19:
                System.out.print("nineteen");
                break;
        }
    }

    public static void readNumberSmallerThan100(int number) {
        int tens = number / 10 % 10;
        int ones = number % 10;
        switch (tens) {
            case 2:
                System.out.print("twenty");
                break;
            case 3:
                System.out.print("thirty");
                break;
            case 4:
                System.out.print("forty");
                break;
            case 5:
                System.out.print("fifty");
                break;
            case 6:
                System.out.print("sixty");
                break;
            case 7:
                System.out.print("seventy");
                break;
            case 8:
                System.out.print("eighty");
                break;
            case 9:
                System.out.print("ninety");
                break;
        }
        if (ones != 0) {
            System.out.print("-");
            readNumberSmallerThan20(ones);
        }
    }

    public static void readNumberSmallerThan1000(int number) {
        int hundreds = number / 100 % 10;
        int tens = number / 10 % 10;
        int ones = number % 10;

        switch (hundreds) {
            case 1:
                System.out.print("one hundred");
                break;
            case 2:
                System.out.print("two hundred");
                break;
            case 3:
                System.out.print("three hundred");
                break;
            case 4:
                System.out.print("four hundred");
                break;
            case 5:
                System.out.print("five hundred");
                break;
            case 6:
                System.out.print("six hundred");
                break;
            case 7:
                System.out.print("seven hundred");
                break;
            case 8:
                System.out.print("eight hundred");
                break;
            case 9:
                System.out.print("nine hundred");
                break;
        }
        if (tens == 1) {
            System.out.print(" and ");
            readNumberSmallerThan20(number - (hundreds * 100));
        } else if (tens != 0) {
            System.out.print(" and ");
            readNumberSmallerThan100(number - (hundreds * 100));
        } else if (ones != 0) {
            System.out.print(" and ");
            readNumberSmallerThan20(number - (hundreds * 100));
        }
    }
}
