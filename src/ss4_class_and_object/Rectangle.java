package ss4_class_and_object;

public class Rectangle {
    double width, height;
    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        double area = width * height;
        return area;
    }

    double getPerimeter() {
        double perimeter = (width + height) * 2;
        return perimeter;
    }

    void display() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 3);
        rectangle1.display();
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
