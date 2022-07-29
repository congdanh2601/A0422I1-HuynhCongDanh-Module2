package ss6_inheritance.circle_and_cylinder;

public class Circle {
    public double radius;
    public String color;
    public double area = Math.pow(radius,2) * Math.PI;

    public Circle() {}

    public Circle(double radius, String color) {
        this.radius = radius;
        area = Math.pow(radius,2) * Math.PI;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
