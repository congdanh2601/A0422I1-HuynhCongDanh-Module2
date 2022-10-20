package case_study.services;

import case_study.controllers.FuramaController;
import case_study.models.*;

import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilities = new LinkedHashMap();
    static Scanner scanner = new Scanner(System.in);
    private static int numberOfFacilities;

    static {
        facilities.put(new Room("Room1", 150, 100, 5, "daily", "Coca"), 5);
        facilities.put(new House("House1", 60, 40, 2, "weekly", "VIP", 2), 1);
        numberOfFacilities = 2;
    }

    @Override
    public void displayList() {
        System.out.println("---*** FACILITIES ***---");
        if(facilities.isEmpty()) {
            System.out.println("---*\tNONE\t*---");
        }
        System.out.println(facilities.entrySet());
    }

    @Override
    public void addNew() {
        while (true) {
            System.out.println("1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu\n");
            System.out.print("Select 1 option: ");
            byte addOption = Byte.parseByte(scanner.nextLine());

            if(addOption > 4 || addOption < 1) {
                System.out.println("Invalid input. Please choose again.");
                continue;
            }
            switch (addOption) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
            }
            if(addOption == 4) break;
        }
    }

    public void addNewVilla() {
        System.out.print("Type new villa name: ");
        String name = scanner.nextLine();

        System.out.print("Type new villa usage area: ");
        double usageArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Type new villa rent price: ");
        double rentPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Type new villa max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Type new villa type of rent: ");
        String rentType = scanner.nextLine();

        System.out.print("Type new villa's room standard: ");
        String roomStandard = scanner.nextLine();

        System.out.print("Type new villa pool's area: ");
        double poolArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Type new villa's number of floors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());

        Villa newVilla = new Villa(name, usageArea, rentPrice, maxPeople, rentType, roomStandard, poolArea, numberOfFloors);
        facilities.put(newVilla, 0);
        System.out.println("New villa added.");
    }

    public void addNewHouse() {
        System.out.print("Type new house name: ");
        String name = scanner.nextLine();

        System.out.print("Type new house usage area: ");
        double usageArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Type new house rent price: ");
        double rentPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Type new house max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Type new house type of rent: ");
        String rentType = scanner.nextLine();

        System.out.print("Type new house's room standard: ");
        String roomStandard = scanner.nextLine();

        System.out.print("Type new house's number of floors: ");
        int numberOfFloors = Integer.parseInt(scanner.nextLine());

        House newHouse = new House(name, usageArea, rentPrice, maxPeople, rentType, roomStandard, numberOfFloors);
        facilities.put(newHouse, 0);
        System.out.println("New house added.");
    }

    public void addNewRoom() {
        System.out.print("Type new room name: ");
        String name = scanner.nextLine();

        System.out.print("Type new room usage area: ");
        double usageArea = Double.parseDouble(scanner.nextLine());

        System.out.print("Type new room rent price: ");
        double rentPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Type new room max people: ");
        int maxPeople = Integer.parseInt(scanner.nextLine());

        System.out.print("Type new room type of rent: ");
        String rentType = scanner.nextLine();

        System.out.print("Type new room's additional free service: ");
        String additionalFreeService = scanner.nextLine();

        Room newRoom = new Room(name, usageArea, rentPrice, maxPeople, rentType, additionalFreeService);
        facilities.put(newRoom, 0);
        System.out.println("New room added.");
    }

    @Override
    public void edit() {

    }

    @Override
    public Person findPersonById() {
        return null;
    }

    public void displayListFacilityMaintenance() {
        System.out.println("---++++\tFACILITIES IN MAINTENANCE\t***---");
        for(Booking b : FuramaController.getBookingService().getThisMonthBooking()){
            if(facilities.containsKey(b.getServiceName()) && facilities.get(b.getServiceName()) >= 5) {
                System.out.println(b);
            }
        }
    }

    public static Map<Facility, Integer> getFacilities() {
        return facilities;
    }
}
