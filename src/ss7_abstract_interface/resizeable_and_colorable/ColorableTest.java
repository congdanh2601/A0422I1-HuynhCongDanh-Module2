package ss7_abstract_interface.resizeable_and_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle area: " + ((Circle)shape).getArea());
            }
            else if (shape instanceof Square) {
                System.out.println("Square area: " + ((Square)shape).getArea());
                ((Square) shape).howToColor();
            }
            else if (shape instanceof Rectangle){
                System.out.println("Rectangle area: " + ((Rectangle)shape).getArea());
            }
            System.out.println();
        }
    }
}
