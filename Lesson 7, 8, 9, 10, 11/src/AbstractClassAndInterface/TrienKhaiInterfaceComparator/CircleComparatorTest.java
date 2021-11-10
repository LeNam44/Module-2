package AbstractClassAndInterface.TrienKhaiInterfaceComparator;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle1[] circles = new Circle1[3];
        circles[0] = new Circle1(3.6);
        circles[1] = new Circle1();
        circles[2] = new Circle1(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle1 circle : circles) {
            System.out.println(circle);
        }

        CircleComparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle1 circle : circles) {
            System.out.println(circle);
        }
    }
}
