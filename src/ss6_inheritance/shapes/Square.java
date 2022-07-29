package ss6_inheritance.shapes;

public class Square extends Rectangle {
    public Square() {
        width = 1.0;
    }

    public Square(double width) {
        this.width = width;
        this.length = width;
    }

    public Square(String color, boolean filled, double width) {
        this(width);
        this.color = color;
        this.filled = filled;
    }

    public void setWidth(double width) {
        super.setWidth(width);
        this.length = width;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
        return "A Square with side=" + width + ", which is a subclass of " + super.toString();
    }
}
