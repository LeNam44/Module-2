package AbstractClassAndInterface.TrienKhaiInterfaceComparator;
import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle1> {
    @Override
    public int compare(Rectangle1 r1, Rectangle1 r2) {
        if (r1.getPerimeter() > r2.getPerimeter()) return 1;
        else if (r1.getPerimeter() < r2.getPerimeter()) return -1;
        else return 0;
    }
}
