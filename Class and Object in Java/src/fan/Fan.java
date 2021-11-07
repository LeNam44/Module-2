package fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed = this.SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {}

    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean getStatus() {
        return this.on;
    }
    public void setStatus(boolean newStatus) {
        this.on = newStatus;
    }

    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String toString() {
        if (this.on) {
            return "Fan speed is " + this.speed + ", color is " + this.color + " and radius is " + this.radius + ". Fan is on";
        } else {
            return "Fan color is " + this.color + ", radius is " + this.radius + ". Fan is off";
        }
    }
}
