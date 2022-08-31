package ss15_exception_debug.use_illegal_triangle_exception;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Type side 1 length: ");
            double side1 = scanner.nextDouble();

            System.out.print("Type side 2 length: ");
            double side2 = scanner.nextDouble();

            System.out.print("Type side 3 length: ");
            double side3 = scanner.nextDouble();

            try {
                if(checkTriangle(side1, side2, side3)) {
                    System.out.println("Valid input.");
                    break;
                }

            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage() + ". Type again.");
            }
        } while (true);
    }

    public static boolean checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Side lengths must be bigger than 0");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side3 + side2 <= side1) {
            throw new IllegalTriangleException("Total of 2 side lengths must be bigger than the remaining side's");
        }
        return true;
    }

}
