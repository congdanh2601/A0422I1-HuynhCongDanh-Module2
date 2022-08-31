package case_study.controllers;

import com.sun.javafx.tk.ScreenConfigurationAccessor;

import java.util.Scanner;

public class FuramaController {
    public int displayMainMenu() {
        System.out.println("---* * * MENU * * *---\n" +
                "1.\tEmployee Management\n" +
                "2.\tCustomer Management\n" +
                "3.\tFacility Management \n" +
                "4.\tBooking Management\n" +
                "5.\tPromotion Management\n" +
                "6.\tExit");
        System.out.print("Select 1 option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int displaySubmenu(int select) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if(select > 6 || select < 0) {
                System.out.print("Invalid input. Please choose again: ");
                select = scanner.nextInt();
            } else {
                switch (select) {
                    case 1:
                        System.out.println("1.\tDisplay list employees\n" +
                                "2.\tAdd new employee\n" +
                                "3.\tEdit employee\n" +
                                "4.\tReturn main menu");
                        System.out.print("Select 1 option: ");
                        return scanner.nextInt();
                    case 2:
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu");
                        System.out.print("Select 1 option: ");
                        return scanner.nextInt();
                    case 3:
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu");
                        System.out.print("Select 1 option: ");
                        return scanner.nextInt();
                    case 4:
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new contracts\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu");
                        System.out.print("Select 1 option: ");
                    case 5:
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu");
                        System.out.print("Select 1 option: ");
                    case 6:
                        System.exit(0);
                }
            }
        }
    }


}
