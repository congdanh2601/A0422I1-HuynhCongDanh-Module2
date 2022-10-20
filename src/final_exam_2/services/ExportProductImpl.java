package final_exam_2.services;

import final_exam_2.controllers.Controller;
import final_exam_2.exception.UserException;
import final_exam_2.models.ExportProduct;
import final_exam_2.models.ImportProduct;
import final_exam_2.models.Product;
import final_exam_2.validators.Validators;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportProductImpl implements Service {
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("C:\\CodeGym\\Module 2\\src\\final_exam_2\\data\\products.csv");

    @Override
    public void addNew() {
        int id = ++ProductManagement.numberOfProducts;
        System.out.println("New product id: " + id);

        String code;
        do {
            System.out.print("Type new product code: ");
            code = scanner.nextLine();
        } while (!Validators.validateProductCode(code));

        String name;
        do {
            System.out.print("Type new product name: ");
            name = scanner.nextLine();
        } while (!Validators.validateString(name));

        int price;
        do {
            System.out.print("Type new product sell price: ");
            price = Integer.parseInt(scanner.nextLine());
        } while (!Validators.checkPositiveNumber(price));

        int amount;
        do {
            System.out.print("Type new product amount: ");
            amount = Integer.parseInt(scanner.nextLine());
        } while (!Validators.checkPositiveNumber(amount));

        String brand;
        do {
            System.out.print("Type new product brand: ");
            brand = scanner.nextLine();
        } while (!Validators.validateString(brand));

        int exportPrice;
        do {
            System.out.print("Type new product export price: ");
            exportPrice = Integer.parseInt(scanner.nextLine());
        } while (!Validators.checkPositiveNumber(exportPrice));

        String importNation;
        do {
            System.out.print("Type new product import nation: ");
            importNation = scanner.nextLine();
        } while (!Validators.validateString(importNation));

        ExportProduct exportProduct = new ExportProduct(id, code, name, price, amount, brand, exportPrice, importNation);
        ProductManagement.products.add(exportProduct);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String writeFile = exportProduct.getId() + "," + exportProduct.getCode() + "," + exportProduct.getName() + "," +
                    exportProduct.getPrice() + "," + exportProduct.getAmount() + "," + exportProduct.getBrand() + "," + exportProduct.getExportPrice()
                    + "," + exportProduct.getImportNation();
            writer.write(writeFile);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println("New export product added.");
    }

    @Override
    public void delete() {
        System.out.print("Type id to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                String[] result = temp.split(",");
                int tempId = Integer.parseInt(result[0]);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayList() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                String[] result = temp.split(",");
                if (result.length == 8) {
                    int id = Integer.parseInt(result[0]);
                    String code = result[1];
                    String name = result[2];
                    int price = Integer.parseInt(result[3]);
                    int amount = Integer.parseInt(result[4]);
                    String brand = result[5];
                    int exportPrice = Integer.parseInt(result[6]);
                    String importNation = result[7];
                    ExportProduct exportProduct = new ExportProduct(id, code, name, price, amount, brand, exportPrice, importNation);
                    System.out.println(exportProduct);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void search() {

    }
}
