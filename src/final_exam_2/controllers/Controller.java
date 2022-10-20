package final_exam_2.controllers;

import final_exam_2.models.Product;
import final_exam_2.services.ExportProductImpl;
import final_exam_2.services.ImportProductImpl;
import final_exam_2.services.ProductManagement;

import java.io.File;
import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("C:\\CodeGym\\Module 2\\src\\final_exam_2\\data\\products.csv");
    static ImportProductImpl importProduct = new ImportProductImpl();
    static ExportProductImpl exportProduct = new ExportProductImpl();


    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (true) {
            System.out.println("--PRODUCTS MANAGEMENT PROGRAM--");
            System.out.println("Choose a function to continue: ");
            System.out.println("1. Add new");
            System.out.println("2. Delete");
            System.out.println("3. Show product list");
            System.out.println("4. Search product");
            System.out.println("5. Exit");
            byte choice;

            System.out.print("Your choice: ");
            choice = Byte.parseByte(scanner.nextLine());
            if (choice > 5 || choice < 1) {
                System.out.println("Invalid input. Please choose again:");
                continue;
            }
            switch (choice) {
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
            }
            if (choice == 5) break;
        }
    }


    public static void displaySubmenu1() {
        while (true) {
            System.out.println("1. Import product");
            System.out.println("2. Export product");
            System.out.println("3. Return main menu");
            System.out.print("Your choice: ");
            byte choice;

            System.out.print("Your choice: ");
            choice = Byte.parseByte(scanner.nextLine());
            if (choice > 3 || choice < 1) {
                System.out.println("Invalid input. Please choose again:");
                continue;
            }
            switch (choice) {
                case 1:
                    importProduct.addNew();
                    break;
                case 2:
                    exportProduct.addNew();
                    break;
            }
            if (choice == 3) break;
        }
    }

    public static void displaySubmenu2() {
        ProductManagement.delete();
    }

    public static void displaySubmenu3() {
        ProductManagement.displayList();
    }

    public static void displaySubmenu4() {
        ProductManagement.search();
    }
}
