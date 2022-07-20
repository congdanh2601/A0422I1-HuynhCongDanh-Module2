package ss4_class_and_object;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    double getRoot1() {
        double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return r1;
    }

    double getRoot2() {
        double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quadratic equation: ax2 + bx + c = 0.\nEnter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();

        if (delta > 0) {
            System.out.printf("The quadratic equation has 2 roots:\n" +
                    "r1 = %5.1f and r2 = %5.1f", quadraticEquation.getRoot1(), quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.printf("The quadratic equation has 1 root: %f", quadraticEquation.getRoot1());
        } else {
            System.out.print("The equation has no roots");
        }
    }
}
