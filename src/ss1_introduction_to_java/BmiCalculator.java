package ss1_introduction_to_java;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meter: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilogram: ");
        double weight = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.printf("BMI = %2.1f. Underweight", bmi);
        } else if (bmi < 25) {
            System.out.printf("BMI = %2.1f. Normal", bmi);
        } else if (bmi < 30) {
            System.out.printf("BMI = %2.1f. Overweight", bmi);
        } else {
            System.out.printf("BMI = %2.1f. Obese", bmi);
        }
    }
}
