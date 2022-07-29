package ss7_abstract_interface.resizeable_and_colorable;

public class Square extends Rectangle implements Resizeable, Colorable {
    public Square() {
        setWidth(1.0);
        setLength(1.0);
    }

    public Square(double side) {
        setWidth(side);
        setLength(side);
    }

    public Square(String color, boolean filled, double side) {
        this(side);
        setColor(color);
        setFilled(filled);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }

    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        setSide(getWidth() * Math.sqrt(percent / 100 + 1));
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
