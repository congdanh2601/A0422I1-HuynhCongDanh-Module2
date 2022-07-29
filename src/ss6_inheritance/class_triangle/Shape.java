package ss6_inheritance.class_triangle;

public class Shape {
    private String color;

    public Shape() {
        color = "green";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public String toString() {
        return "A Shape with color " + color;
    }
}
