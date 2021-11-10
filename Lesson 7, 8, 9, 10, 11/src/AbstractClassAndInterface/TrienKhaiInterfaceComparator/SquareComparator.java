package AbstractClassAndInterface.TrienKhaiInterfaceComparator;
import java.util.Comparator;

public class SquareComparator implements Comparator<Square1> {
    @Override
    public int compare(Square1 s1, Square1 s2) {
        if (s1.getPerimeter() > s2.getPerimeter()) return 1;
        else if (s1.getPerimeter() < s2.getPerimeter()) return -1;
        else return 0;
    }
}
