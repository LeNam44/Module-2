package accessmodifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {}
    Circle(double r) {}

    protected double getRadius() {
        return this.radius;
    }

    protected String getColor() {
        return this.color;
    }
}
