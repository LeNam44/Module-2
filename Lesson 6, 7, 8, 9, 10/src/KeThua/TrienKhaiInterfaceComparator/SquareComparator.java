package KeThua.TrienKhaiInterfaceComparator;
import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {
    @Override
    public int compare(Square s1, Square s2) {
        if (s1.getPerimeter() > s2.getPerimeter()) return 1;
        else if (s1.getPerimeter() < s2.getPerimeter()) return -1;
        else return 0;
    }
}
