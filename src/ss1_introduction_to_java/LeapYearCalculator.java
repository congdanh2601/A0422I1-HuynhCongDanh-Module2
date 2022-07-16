package ss1_introduction_to_java;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year to check if it is a leap year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year");
        }
    }
}
