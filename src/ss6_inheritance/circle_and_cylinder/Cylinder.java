package ss6_inheritance.circle_and_cylinder;

public class Cylinder extends Circle {
    public double height;
    public double volume = area * height;

    public Cylinder() {}

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
        volume = area * this.height;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                ", height=" + height +
                ", volume=" + volume +
                '}';
    }
}
