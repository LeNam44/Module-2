package lopcirclevalopcylinder;

public class MainTest {
    public static void main(String[] args) {
        //test circle
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3, "red");
        System.out.println(circle1);
        //test cylinder
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        Cylinder cylinder1 = new Cylinder(5);
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(6, 3, "yellow");
        System.out.println(cylinder2);
    }
}
