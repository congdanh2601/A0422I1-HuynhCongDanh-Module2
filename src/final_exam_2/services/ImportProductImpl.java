package final_exam_2.services;

import final_exam_2.exception.UserException;
import final_exam_2.models.ExportProduct;
import final_exam_2.models.ImportProduct;
import final_exam_2.validators.Validators;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportProductImpl implements Service {
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

        int importPrice;
        do {
            System.out.print("Type new product import price: ");
            importPrice = Integer.parseInt(scanner.nextLine());
        } while (!Validators.checkPositiveNumber(importPrice));

        String importProvince;
        do {
            System.out.print("Type new product import province: ");
            importProvince = scanner.nextLine();
        } while (!Validators.validateString(importProvince));

        int importTax;
        do {
            System.out.print("Type new product import tax: ");
            importTax = Integer.parseInt(scanner.nextLine());
        } while (!Validators.checkPositiveNumber(importTax));

        ImportProduct importProduct = new ImportProduct(id, code, name, price, amount, brand, importPrice, importProvince, importTax);
        ProductManagement.products.add(importProduct);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            String writeFile = importProduct.getId() + "," + importProduct.getCode() + "," + importProduct.getName() + "," +
                    importProduct.getPrice() + "," + importProduct.getAmount() + "," + importProduct.getBrand() + "," + importProduct.getImportPrice()
                    + "," + importProduct.getImportProvince() + "," + importProduct.getImportTax();
            writer.write(writeFile);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        System.out.println("New import product added.");
    }

    @Override
    public void delete() {

    }

    @Override
    public void displayList() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = reader.readLine()) != null) {
                String[] result = temp.split(",");
                if (result.length == 9) {
                    int id = Integer.parseInt(result[0]);
                    String code = result[1];
                    String name = result[2];
                    int price = Integer.parseInt(result[3]);
                    int amount = Integer.parseInt(result[4]);
                    String brand = result[5];
                    int importPrice = Integer.parseInt(result[6]);
                    String importProvince = result[7];
                    int importTax = Integer.parseInt(result[8]);
                    ImportProduct importProduct = new ImportProduct(id, code, name, price, amount, brand, importPrice, importProvince, importTax);
                    System.out.println(importProduct);
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
