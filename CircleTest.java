package KethuaDesigner;

public class CircleTest {
    private double radius;
    private String color;

    public CircleTest(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "CircleTest [radius=" + radius + ", color=" + color + "]";
    }
}
