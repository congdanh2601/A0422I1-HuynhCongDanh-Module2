package case_study.services;

import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList();
    private static int numberOfEmployee = 0;

    public EmployeeServiceImpl() {
    }

    public void displayEmployeeList() {
        System.out.println("Employee List:");
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    public void addEmployee(Employee e) {
        employeeList.add(e);
        numberOfEmployee++;
        System.out.println("Employee added.");
    }

    public void editEmployee() {
        System.out.println("Which employee do you want to change information: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        

        System.out.println("1. Id\t" +
                "    2. Name\t" +
                "    3. Date of birth\n" +
                "    4. Sex\t" +
                "    5. National Id\t" +
                "    6. Phone number\n" +
                "    7. Email");
        System.out.print("Which property do you want to change: ");

        int property = scanner.nextInt();
        while (true) {
            if (property > 7 || property < 0) {
                System.out.print("Invalid input. Please choose again: ");
                property = scanner.nextInt();
            } else {
                switch (property) {
                    case 1:

                }
            }
        }
    }
}
