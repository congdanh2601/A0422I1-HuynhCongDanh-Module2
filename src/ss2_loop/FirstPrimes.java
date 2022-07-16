package ss2_loop;

import java.util.Scanner;

public class FirstPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number(s) of primes you want to display: ");
        int number = scanner.nextInt();
        showPrimes(number);
    }

    public static void showPrimes(int number) {
        int count = 0;
        String result = "";
        for (int i = 2; count < number; i++) {
            if (checkPrime(i)) {
                result += i + "  ";
                count++;
            }
        }
        System.out.println(result);
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
