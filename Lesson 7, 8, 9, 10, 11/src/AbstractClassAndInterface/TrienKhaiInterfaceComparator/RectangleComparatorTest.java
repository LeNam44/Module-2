package AbstractClassAndInterface.TrienKhaiInterfaceComparator;

import java.util.Arrays;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle1[] rectangles = new Rectangle1[3];
        rectangles[0] = new Rectangle1(5,10);
        rectangles[1] = new Rectangle1();
        rectangles[2] = new Rectangle1(7,12,"black", true);

        System.out.println("Pre-sorted");
        for (Rectangle1 rectangle : rectangles) {
            System.out.println(rectangle);
        }

        RectangleComparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles, rectangleComparator);

        System.out.println("After-sorted");
        for (Rectangle1 rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }


}
