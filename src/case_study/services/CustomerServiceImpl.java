package case_study.services;

import case_study.models.Customer;
import case_study.models.Person;
import case_study.validate.Validator;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    static int numberOfCustomer;
    static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "Phuong", new Date("3/25/1965"), "female", "0491651321456", "0968451079", "danhminhhuynh79@gmail.com", "Diamond", "Duy Xuyen"));
        customerList.add(new Customer(2, "Du", new Date("4/6/1964"), "male", "0490641321456", "0354398345", "tranhuynh06@gmail.com", "Gold", "Duy Xuyen"));
    }

    @Override
    public void displayList() {
        System.out.println("---*** CUSTOMER LIST ***---");
        if (customerList.isEmpty()) {
            System.out.println("---*\tNONE\t*---");
        } else {
            for (Customer c : customerList) {
                System.out.println(c);
            }
        }
    }

    @Override
    public void addNew() {
        System.out.print("Type new customer id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Type new customer name: ");
        String name = scanner.nextLine();

        System.out.print("Type new customer date of birth: ");
        String dateAsString = scanner.nextLine();
        Date dateOfBirth = Validator.dateValidator(dateAsString);

        System.out.print("Type new customer sex: ");
        String sex = scanner.nextLine();

        System.out.print("Type new customer national id: ");
        String nationalId = scanner.nextLine();

        System.out.print("Type new customer phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Type new customer email: ");
        String email = scanner.nextLine();

        System.out.print("Type new customer type: ");
        String typeOfCustomer = scanner.nextLine();

        System.out.print("Type new customer address: ");
        String address = scanner.nextLine();

        Customer newCustomer = new Customer(id, name, dateOfBirth, sex, nationalId, phoneNumber, email, typeOfCustomer, address);
        customerList.add(newCustomer);
        numberOfCustomer++;
        System.out.println("New customer added.");
    }

    @Override
    public void edit() {
        Customer c = (Customer) findPersonById();
        System.out.println(c);
        System.out.print("Type new name for the customer: ");
        c.setName(scanner.nextLine());
        System.out.println("The customer after edit:\n" + c);
    }

    @Override
    public Person findPersonById() {
        while (true) {
            System.out.print("Find customer by id: ");
            int id = Integer.parseInt(scanner.nextLine());
            int index = customerList.size();
            for (int i = 0; i < index; i++) {
                if (customerList.get(i).getId() == id) {
                    index = i;
                    System.out.println(customerList.get(i));
                    break;
                }
            }
            if (index == customerList.size()) {
                System.out.println("Can't find any customer with that id.");
            } else {
                return customerList.get(index);
            }
        }
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    public static int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
