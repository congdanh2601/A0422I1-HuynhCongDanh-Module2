package ss17_io_binary_file_serialization;

import ss16_io_text_file.e2_read_csv_file.Nation;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        File file = new File("List of products.csv");


//        byte choice;

        while (true) {
            System.out.println("---*** MENU ***---");
            System.out.println("1. Add product");
            System.out.println("2. Display product list");
            System.out.println("3. Find a product");
            System.out.println("4. Save changes to file");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            byte choice = scanner.nextByte();
            if (choice > 6 || choice < 1) {
                System.out.print("Invalid choice. Type again: ");
                choice = scanner.nextByte();
            } else {
                switch (choice) {
                    case 1:
                        System.out.println("1. From file");
                        System.out.println("2. Type new product");
                        System.out.println("3. Back to main menu");
                        System.out.print("How do you want to add product: ");
                        byte addProductBy = scanner.nextByte();
                        scanner.nextLine();

                        while (addProductBy != 3) {
                            if (addProductBy == 1 || addProductBy == 2) {
                                switch (addProductBy) {
                                    case 1:
                                        if (file.exists()) {
                                            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                                                Product pAdd;
                                                while ((pAdd = (Product) objectInputStream.readObject()) != null) {
                                                    productList.add(pAdd);
                                                }
                                                System.out.println("Done");
                                            } catch (IOException | ClassNotFoundException e) {
                                                e.printStackTrace();
                                            }
                                        } else System.out.println("File is not exist.");
                                        break;
                                    case 2:
                                        System.out.print("Type new product id: ");
                                        int id = scanner.nextInt();
                                        scanner.nextLine();

                                        System.out.print("Type new product name: ");
                                        String name = scanner.nextLine();

                                        System.out.print("Type new product brand: ");
                                        String brand = scanner.nextLine();

                                        System.out.print("Type new product price: ");
                                        double price = scanner.nextDouble();
                                        scanner.nextLine();

                                        Product p = new Product(id, name, brand, price);
                                        productList.add(p);
                                        System.out.println("Done");
                                        break;
                                }
                            } else {
                                System.out.print("Invalid input. Type again: ");
                                addProductBy = scanner.nextByte();
                            }
                            break;
                        }
                        break;
                    case 2:
                        System.out.println("---**  List of products  **---");
                        for (Product product : productList) {
                            System.out.println(product);
                        }
                        break;
                    case 3:
                        System.out.println("1. Id");
                        System.out.println("2. Name");
                        System.out.println("3. Brand");
                        System.out.println("4. Price");
                        System.out.println("5. Back to main menu");
                        System.out.println("Which property do you want to find by: ");
                        byte subChoice = scanner.nextByte();
                        scanner.nextLine();
                        boolean isExist = false;

                        while (subChoice != 5) {
                            if (subChoice > 4 || subChoice < 1) {
                                System.out.print("Invalid choice. Type again: ");
                                subChoice = scanner.nextByte();
                                scanner.nextLine();
                            } else {
                                switch (subChoice) {
                                    case 1:
                                        System.out.print("Type id to find: ");
                                        int idToFind = scanner.nextInt();
                                        scanner.nextLine();
                                        for (Product product : productList) {
                                            if (product.getId() == idToFind) {
                                                isExist = true;
                                                System.out.println(product);
                                            }
                                        }
                                        if (!isExist) {
                                            System.out.println("Can't find product with that id.");
                                        }
                                        break;
                                    case 2:
                                        System.out.print("Type name to find: ");
                                        String nameToFind = scanner.nextLine();
                                        for (Product product : productList) {
                                            if (Objects.equals(product.getName(), nameToFind)) {
                                                isExist = true;
                                                System.out.println(product);
                                            }
                                        }
                                        if (!isExist) {
                                            System.out.println("Can't find product with that name.");
                                        }
                                        break;
                                    case 3:
                                        System.out.print("Type brand to find: ");
                                        String brandToFind = scanner.nextLine();
                                        for (Product product : productList) {
                                            if (Objects.equals(product.getBrand(), brandToFind)) {
                                                isExist = true;
                                                System.out.println(product);
                                            }
                                        }
                                        if (!isExist) {
                                            System.out.println("Can't find product with that brand.");
                                        }
                                        break;
                                    case 4:
                                        System.out.print("Type price to find: ");
                                        double priceToFind = scanner.nextDouble();
                                        scanner.nextLine();
                                        for (Product product : productList) {
                                            if (product.getPrice() == priceToFind) {
                                                isExist = true;
                                                System.out.println(product);
                                            }
                                        }
                                        if (!isExist) {
                                            System.out.println("Can't find product with that price.");
                                        }
                                        break;
                                }
                            }
                            break;
                        }
                        break;

                    case 4:
                        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                            for (Product product : productList) {
                                outputStream.writeObject(product);
                            }
                            System.out.println("Done");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        System.exit(0);
                }
            }
        }
    }
}
