package ss5_accessmodifier_static.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.pow(radius,2) * 3.14;
    }

}
