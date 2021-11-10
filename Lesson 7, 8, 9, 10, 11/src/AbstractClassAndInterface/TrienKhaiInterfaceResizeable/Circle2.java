package AbstractClassAndInterface.TrienKhaiInterfaceResizeable;

public class Circle2 extends Shape2 {
    private double radius = 1.0;

    public Circle2() {
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        double newArea = getArea() * percent;
        System.out.println("Area of Circle: " + getArea()+ " after resize to " + Math.round(percent*100) + "% is " + newArea);
    }
}
