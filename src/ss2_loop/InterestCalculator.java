package ss2_loop;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How much money: ");
        int rent = scanner.nextInt();

        System.out.print("Type interest rate (%): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("How many months do you want to rent: ");
        int month = scanner.nextInt();

        double interestMoney = rent * interestRate / 12 * month;

        System.out.printf("Your total money after %d month(s): %.2f.", month, interestMoney+rent);
    }
}
