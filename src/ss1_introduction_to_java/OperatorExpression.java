package ss1_introduction_to_java;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter height: ");
        height = scanner.nextFloat();

//        System.out.println(width);
//        System.out.println(height);

        float area = width * height;
        System.out.println("Area is: " + area);

    }
}
