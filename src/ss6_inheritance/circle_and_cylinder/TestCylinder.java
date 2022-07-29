package ss6_inheritance.circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, "blue", 3);
        System.out.println(cylinder);

        Circle circle = new Circle(10, "red");
        System.out.println(circle);
    }
}
