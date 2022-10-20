package case_study.services;

import case_study.models.Employee;
import case_study.models.Person;
import case_study.validate.Validator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList();
    private static int numberOfEmployee;
    static Scanner scanner = new Scanner(System.in);

    static {
        employeeList.add(new Employee(1, "Danh", new Date("01/26/1996"), "male", "205873518", "0376300628", "congdanhdp14@gmail.com", "Uni", "boss", 15000));
        employeeList.add(new Employee(2, "Minh", new Date("04/5/2003"), "male", "204513589", "0968132546", "minhhuynh@gmail.com", "Uni", "boss", 11000));
        numberOfEmployee = 2;
    }

    public void displayList() {
        System.out.println("---*** EMPLOYEE LIST ***---");
        if (employeeList.isEmpty()) {
            System.out.println("---*\tNONE\t*---");
        } else {
            for (Employee e : employeeList) {
                System.out.println(e);
            }
        }
    }

    @Override
    public void addNew() {
        System.out.print("Type new employee id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Type new employee name: ");
        String name = scanner.nextLine();

        System.out.print("Type new employee date of birth: ");
        String dateAsString = scanner.nextLine();
        Date dateOfBirth = Validator.dateValidator(dateAsString);

        System.out.print("Type new employee sex: ");
        String sex = scanner.nextLine();

        System.out.print("Type new employee national id: ");
        String nationalId = scanner.nextLine();

        System.out.print("Type new employee phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Type new employee email: ");
        String email = scanner.nextLine();

        System.out.print("Type new employee academic level: ");
        String academicLevel = scanner.nextLine();

        System.out.print("Type new employee position: ");
        String position = scanner.nextLine();

        System.out.print("Type new employee salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee newEmployee = new Employee(id, name, dateOfBirth, sex, nationalId, phoneNumber, email, academicLevel, position, salary);
        employeeList.add(newEmployee);
        numberOfEmployee++;
        System.out.println("New employee added.");
    }

    public void edit() {
        Employee e = (Employee) findPersonById();
        System.out.println(e);
        System.out.print("Type new name for the employee: ");
        e.setName(scanner.nextLine());
        System.out.println("The employee after edit:\n" + e);

    }

    public Person findPersonById() {
        while(true) {
            System.out.print("Fine employee by id: ");
            int id = Integer.parseInt(scanner.nextLine());
            int index = employeeList.size();
            for (int i = 0; i < index; i++) {
                if (employeeList.get(i).getId() == id) {
                    index = i;
                    System.out.println(employeeList.get(i));
                    break;
                }
            }
            if (index == employeeList.size()) {
                System.out.println("Can't find any employee with that id. Type again.");
            } else return employeeList.get(index);
        }
    }

    public static List<Employee> getEmployeeList() {
        return employeeList;
    }
}
