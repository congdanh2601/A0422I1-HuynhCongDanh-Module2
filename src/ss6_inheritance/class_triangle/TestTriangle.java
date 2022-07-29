package ss6_inheritance.class_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Shape shape = new Shape("red");
        System.out.println(shape);
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose a color: ");
        triangle.setColor(scanner.nextLine());

        System.out.print("Type 3 sides of the triangle: ");
        triangle.setSide1(scanner.nextDouble());
        triangle.setSide2(scanner.nextDouble());
        triangle.setSide3(scanner.nextDouble());


        System.out.println(triangle);
    }
}
