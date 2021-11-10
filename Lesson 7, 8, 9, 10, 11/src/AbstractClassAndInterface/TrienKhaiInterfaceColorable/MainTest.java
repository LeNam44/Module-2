package AbstractClassAndInterface.TrienKhaiInterfaceColorable;

public class MainTest {
    public static void main(String[] args) {
        Shape3[] shapes = new Shape3[3];
        shapes[0] = new Circle3(6, "green", true);
        shapes[1] = new Rectangle3(4,8, "black", true);
        shapes[2] = new Square3(5, "yellow", false);

        for (Shape3 shape: shapes) {
            shape.howToColor();
        }
    }
}
