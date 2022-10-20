package final_exam_2.services;

import com.sun.corba.se.spi.activation.LocatorPackage.ServerLocationPerORB;
import final_exam_2.models.ExportProduct;
import final_exam_2.models.ImportProduct;
import final_exam_2.models.Product;
import final_exam_2.validators.Validators;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    static List<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static int numberOfProducts;
    static File file = new File("C:\\CodeGym\\Module 2\\src\\final_exam_2\\data\\products.csv");

    public static void displayList() {
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

    public static void delete() {
        List<Product> productList = new ArrayList<>();
        int id;
        do {
            System.out.print("Type product id to delete: ");
            id = Integer.parseInt(scanner.nextLine());
        } while (!Validators.checkPositiveNumber(id));
        productList = readFile();
        boolean exist = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                productList.remove(product);
                exist = true;
                break;
            }
        }
        if(exist) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Product product1 : productList) {
                    if (product1 instanceof ExportProduct) {
                        ExportProduct exportProduct = (ExportProduct) product1;
                        String writeFile = exportProduct.getId() + "," + exportProduct.getCode() + "," + exportProduct.getName() + "," +
                                exportProduct.getPrice() + "," + exportProduct.getAmount() + "," + exportProduct.getBrand() + "," + exportProduct.getExportPrice()
                                + "," + exportProduct.getImportNation();
                        writer.write(writeFile);
                        writer.newLine();
                    } else if (product1 instanceof ImportProduct) {
                        ImportProduct importProduct = (ImportProduct) product1;
                        String writeFile = importProduct.getId() + "," + importProduct.getCode() + "," + importProduct.getName() + "," +
                                importProduct.getPrice() + "," + importProduct.getAmount() + "," + importProduct.getBrand() + "," + importProduct.getImportPrice()
                                + "," + importProduct.getImportProvince() + "," + importProduct.getImportTax();
                        writer.write(writeFile);
                        writer.newLine();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Deleted");
        } else {
            System.out.println("Not found");
        }
    }


    public static List<Product> readFile() {
        List<Product> productList = new ArrayList<>();
        String temp;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
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
                    productList.add(importProduct);
                }
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
                    productList.add(exportProduct);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void search() {
        List<Product> productList = new ArrayList<>();
        int id;
        do {
            System.out.print("Type product id to search: ");
            id = Integer.parseInt(scanner.nextLine());
        } while (!Validators.checkPositiveNumber(id));

        List<Product> products = readFile();
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println(product);
                break;
            }

        }
    }
}
