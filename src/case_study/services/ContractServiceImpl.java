package case_study.services;

import case_study.controllers.FuramaController;
import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.Person;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    private static Queue<Contract> contractQueue = new LinkedList<>();
    private static int numberOfContract;
    static Scanner scanner = new Scanner(System.in);

    static {
        contractQueue.add(new Contract(1, 2, 150, 200, 1));
        contractQueue.add(new Contract(1, 2, 170, 250, 2));
    }

    @Override
    public void displayList() {
        System.out.println("---***\tCONTRACTS\t***---");
        contractQueue.forEach(System.out::println);
    }

    @Override
    public void addNew() {
        for (Booking b : FuramaController.getBookingService().getBookingSet()) {
            int contractNumber = contractQueue.size();
            int bookingCode = b.getBookingCode();

            System.out.print("Type deposit: ");
            double deposit = Double.parseDouble(scanner.nextLine());

            System.out.print("Type total amount to pay: ");
            double totalAmountToPay = Double.parseDouble(scanner.nextLine());

            int customerId = b.getCustomerId();

            Contract contract = new Contract(contractNumber, bookingCode, deposit, totalAmountToPay, customerId);
            contractQueue.add(contract);
            numberOfContract++;
        }
    }


    @Override
    public void edit() {

    }

    @Override
    public Person findPersonById() {
        return null;
    }

    public static Queue<Contract> getContractQueue() {
        return contractQueue;
    }

    public static int getNumberOfContract() {
        return numberOfContract;
    }
}
