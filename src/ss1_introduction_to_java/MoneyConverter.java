package ss1_introduction_to_java;

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount of USD: ");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println(usd + " USD = " + vnd + " VNĐ");
    }
}
