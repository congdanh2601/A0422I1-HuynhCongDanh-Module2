package ss6_inheritance.point_and_movablepoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1.1f, 1.2f);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint();
        moveablePoint.setXY(2.0f, 3.0f);
        moveablePoint.setSpeed(1.1f, 1.2f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
