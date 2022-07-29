package ss6_inheritance.shapes;

public class Shape {
    public String color;
    public boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        if(filled) return  "A Shape with color " + color + " and filled";
        else return "A Shape with color " + color + " and not filled";
    }
}
