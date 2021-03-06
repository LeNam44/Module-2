package lopcirclevalopcylinder;

public class Cylinder extends Circle {
    private double height = 4;

    public Cylinder() {
    }
    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return this.height * Math.pow(super.getRadius(), 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Cylinder with height of "
                + getHeight()
                + " and volume of "
                + getVolume()
                + ", which is a subclass of "
                + super.toString();
    }
}
