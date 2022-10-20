package case_study.services;

import case_study.controllers.FuramaController;
import case_study.models.Booking;
import case_study.models.Customer;
import case_study.models.Facility;
import case_study.models.Person;
import case_study.utils.BookingComparator;
import case_study.validate.Validator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static TreeSet<Booking> bookingSet = new TreeSet(new BookingComparator());
    private static int numberOfBooking;
    static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> thisMonthBooking = new TreeSet(new BookingComparator());

    static {
        bookingSet.add(new Booking(1, new Date("09/12/2022"), new Date("9/12/2022"), 1, "Room", "Free"));
        bookingSet.add(new Booking(2, new Date("09/02/2022"), new Date("9/12/2022"), 2, "Villa", "Free"));
        bookingSet.add(new Booking(3, new Date("09/05/2022"), new Date("9/12/2022"), 3, "House", "Free"));
        bookingSet.add(new Booking(4, new Date("09/05/2022"), new Date("9/11/2022"), 4, "Room", "Free"));
        numberOfBooking = 4;
        for (Booking b : bookingSet) {
            if(b.getCheckInDay().after(new Date("08/31/2022"))) {
                thisMonthBooking.add(b);
            }
        }
    }

    @Override
    public void displayList() {
        System.out.println("--** LIST OF BOOKING **--");
        if (bookingSet.isEmpty()) {
            System.out.println("---*\tNONE\t*---");
        } else {
            for (Booking b : bookingSet) {
                System.out.println(b);
            }
        }
    }

    @Override
    public void addNew() {
        Customer customer = (Customer) findPersonById();

        Facility facility = findServiceByName();

        int bookingCode = ++numberOfBooking;

        System.out.print("Type check-in date (dd/MM/yyyy): ");
        String checkInDayStr = scanner.nextLine();
        Date checkInDay = Validator.dateValidator(checkInDayStr);

        System.out.print("Type check-out date (dd/MM/yyyy): ");
        String checkOutDayStr = scanner.nextLine();
        Date checkOutDay = Validator.dateValidator(checkOutDayStr);

        System.out.print("Choose service type: ");
        String serviceType = scanner.nextLine();

        Booking newBooking = new Booking(bookingCode, checkInDay, checkOutDay, customer.getId(), facility.getName(), serviceType);
        bookingSet.add(newBooking);
        Map<Facility, Integer> facilities = FuramaController.getFacilityService().getFacilities();
        facilities.put(facility, facilities.get(facility) + 1);
        if(newBooking.getCheckInDay().after(new Date(2022,8,31))) {
            thisMonthBooking.add(newBooking);
        }

    }

    @Override
    public void edit() {

    }

    @Override
    public Person findPersonById() {
        CustomerServiceImpl customerService = FuramaController.getCustomerService();
        customerService.displayList();
        while (true) {
            System.out.print("Choose customer id: ");
            int customerId = Integer.parseInt(scanner.nextLine());
            for (Customer c : customerService.getCustomerList()) {
                if(c.getId() == customerId) {
                    return c;
                }
            }
            System.out.println("Can't find any customer with that id. Type again.");
        }
    }

    @Override
    public Facility findServiceByName() {
        FacilityServiceImpl facility = FuramaController.getFacilityService();
        facility.displayList();
        while (true) {
            System.out.print("Choose service by name: ");
            String serviceName = scanner.nextLine();
            Set<Facility> services = facility.getFacilities().keySet();
//            if(facility.getFacilities().get(serviceName) > 5) {
//                System.out.println("Sorry! Service is in maintenance. Please choose another.");
//                continue;
//            }
            for (Facility f : services) {
                if (f.getName().equals(serviceName)) {
                    return f;
                }
            }
            System.out.println("Can't find any service with that name. Type again.");
        }
    }

    public static TreeSet<Booking> getBookingSet() {
        return bookingSet;
    }

    public static int getNumberOfBooking() {
        return numberOfBooking;
    }

    public static Set<Booking> getThisMonthBooking() {
        return thisMonthBooking;
    }
}
