package KeThua.TrienKhaiInterfaceComparator;

import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(5,10);
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle(7,12,"black", true);

        System.out.println("Pre-sorted");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("After-sorted");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }


}
