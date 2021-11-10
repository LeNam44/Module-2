package AbstractClassAndInterface.TrienKhaiInterfaceComparator;

import java.util.Arrays;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square1[] squares = new Square1[3];
        squares[0] = new Square1(5);
        squares[1] = new Square1();
        squares[2] = new Square1(8, "purple", true);

        System.out.println("Pre-sorted");
        for (Square1 square : squares) {
            System.out.println(square);
        }

        SquareComparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("After-sorted");
        for (Square1 square : squares) {
            System.out.println(square);
        }
    }
}
