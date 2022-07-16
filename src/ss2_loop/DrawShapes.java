package ss2_loop;

import java.util.Scanner;

public class DrawShapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Menu: \n" +
                "1. Print the rectangle\n" +
                "2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, bottom-left, bottom-right)\n" +
                "3. Print isosceles triangle\n" +
                "4. Exit \n" +
                "Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                drawRectangle();
                break;
            case 2:
                drawSquareTriangle();
                break;
            case 3:
                drawIsoscelesTriangle();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void drawRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height of the rectangle: ");
        int height = scanner.nextInt();

        System.out.print("Enter width of the rectangle: ");
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void drawSquareTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter squared angle side: ");
        int squaredAngle = scanner.nextInt();

        //bottom-left
        for (int i = 1; i <= squaredAngle; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //top-left
        for (int i = 1; i <= squaredAngle; i++) {
            for (int j = 1; j <= (squaredAngle - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        //top-right
        for (int i = 1; i <= squaredAngle; i++) {
            for (int j = 1; j <= squaredAngle; j++) {
                if (j >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //bottom-right
        for (int i = 1; i <= squaredAngle; i++) {
            for (int j = 1; j <= squaredAngle; j++) {
                if (j >= squaredAngle - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawIsoscelesTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height of the isosceles triangle: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (height * 2 - 1); j++) {
                if (j >= height - i + 1 && j <= height + i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
