package loppointvamoveablepoint;

public class MainTest {
    public static void main(String[] args) {
        Point point = new Point(4,2);
        System.out.println(point);

        MoveablePoint point1 = new MoveablePoint(4,2,2,4);
        System.out.println(point1);
        point1.move();
        System.out.println(point1);
    }
}
