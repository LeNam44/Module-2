package AbstractClassAndInterface.TrienKhaiInterfaceResizeable;

public class MainTest {
    public static void main(String[] args) {

        double size = Math.random();

        Shape2[] shapes = new Shape2[3];
        shapes[0] = new Circle2(5);
        shapes[1] = new Rectangle2(6,12);
        shapes[2] = new Square2(4);

        System.out.println("Resize");
        for (Shape2 shape: shapes) {
            shape.resize(size);
        }

    }
}
