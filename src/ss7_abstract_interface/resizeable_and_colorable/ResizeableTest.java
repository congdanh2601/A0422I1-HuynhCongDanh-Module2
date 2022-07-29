package ss7_abstract_interface.resizeable_and_colorable;

public class ResizeableTest {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            double percent = Math.random() * 99 + 1;
            System.out.println("Percent: " + percent + "%");
            if (shape instanceof Circle) {
                System.out.println("Circle area: " + ((Circle)shape).getArea());
                ((Circle) shape).resize(percent);
                System.out.println("New circle area: " + ((Circle)shape).getArea());
            }
            else if (shape instanceof Square) {
                System.out.println("Square area: " + ((Square)shape).getArea());
                ((Square)shape).resize(percent);
                System.out.println("New square area: " + ((Square)shape).getArea());
            }
            else if (shape instanceof Rectangle) {
                System.out.println("Rectangle area: " + ((Rectangle)shape).getArea());
                ((Rectangle) shape).resize(percent);
                System.out.println("New rectangle area: " + ((Rectangle)shape).getArea());
            }

            System.out.println();
        }
    }
}
