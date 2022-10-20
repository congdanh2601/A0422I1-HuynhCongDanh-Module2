package case_study.controllers;

import case_study.services.*;

import java.util.Scanner;

public class FuramaController {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    static CustomerServiceImpl customerService = new CustomerServiceImpl();
    static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static BookingServiceImpl bookingService = new BookingServiceImpl();
    static ContractServiceImpl contractService = new ContractServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("---* * * MENU * * *---\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit");
            System.out.print("Select 1 option: ");
            byte select = Byte.parseByte(scanner.nextLine());
            displaySubmenu(select);
        }
    }

    public static void displaySubmenu(int select) {
        while (true) {
            if (select > 6 || select < 0) {
                System.out.print("Invalid input. Please choose again.");
                break;
            }
            switch (select) {
                case 1:
                    displaySubmenu1();
                    break;
                case 2:
                    displaySubmenu2();
                    break;
                case 3:
                    displaySubmenu3();
                    break;
                case 4:
                    displaySubmenu4();
                    break;
                case 5:
                    displaySubmenu5();
                    break;
                case 6:
                    System.exit(0);
            }
            break;
        }
    }

    public static void displaySubmenu1() {
        while (true) {
            System.out.println("1.\tDisplay list of employees\n" +
                    "2.\tAdd new employee\n" +
                    "3.\tEdit employee\n" +
                    "4.\tReturn main menu");
            System.out.print("Select 1 option: ");
            byte subSelect1 = Byte.parseByte(scanner.nextLine());
            if (subSelect1 > 4 || subSelect1 < 1) {
                System.out.print("Invalid input. Please choose again:");
                continue;
            }
            switch (subSelect1) {
                case 1:
                    employeeService.displayList();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
            }
            if (subSelect1 == 4) break;
        }
    }

    public static void displaySubmenu2() {
        while (true) {
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu");
            System.out.print("Select 1 option: ");
            byte subSelect2 = Byte.parseByte(scanner.nextLine());
            if (subSelect2 > 4 || subSelect2 < 1) {
                System.out.print("Invalid input. Please choose again:");
                continue;
            }
            switch (subSelect2) {
                case 1:
                    customerService.displayList();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
            }
            if (subSelect2 == 4) break;
        }
    }

    public static void displaySubmenu3() {
        while (true) {
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu");
            System.out.print("Select 1 option: ");
            byte subSelect3 = Byte.parseByte(scanner.nextLine());
            if (subSelect3 > 4 || subSelect3 < 1) {
                System.out.println("Invalid input. Please choose again:");
                continue;
            }
            switch (subSelect3) {
                case 1:
                    facilityService.displayList();
                    break;
                case 2:
                    facilityService.addNew();
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
            }
            if (subSelect3 == 4) break;
        }
    }

    public static void displaySubmenu4() {
        while(true) {
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new contracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu");
            System.out.print("Select 1 option: ");
            byte subSelect4 = Byte.parseByte(scanner.nextLine());
            if (subSelect4 > 6 || subSelect4 < 1) {
                System.out.print("Invalid input. Please choose again:");
                continue;
            }
            switch (subSelect4) {
                case 1:
                    bookingService.addNew();
                    break;
                case 2:
                    bookingService.displayList();
                    break;
                case 3:
                    contractService.addNew();
                    break;
                case 4:
                    contractService.displayList();
                    break;
                case 5:
                    contractService.edit();
            }
            if (subSelect4 == 6) break;
        }
    }

    public static void displaySubmenu5() {
        System.out.println("1.\tDisplay list customers use service\n" +
                "2.\tDisplay list customers get voucher\n" +
                "3.\tReturn main menu");
        System.out.print("Select 1 option: ");
    }

    public static EmployeeServiceImpl getEmployeeService() {
        return employeeService;
    }

    public static CustomerServiceImpl getCustomerService() {
        return customerService;
    }

    public static FacilityServiceImpl getFacilityService() {
        return facilityService;
    }

    public static BookingServiceImpl getBookingService() {
        return bookingService;
    }

    public static ContractServiceImpl getContractService() {
        return contractService;
    }
}
