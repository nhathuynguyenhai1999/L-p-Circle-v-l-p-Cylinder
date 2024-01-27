package KethuaDesigner;

public class Cylinder extends CircleTest {
    private double height;

    public Cylinder(double radius, String color, double height) {
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
        return getArea() * height;
    }
    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        CircleTest circle = new CircleTest(5.0, "Red");
        System.out.println("Circle:");
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());

        System.out.println();

        Cylinder cylinder = new Cylinder(3.0, "Blue", 10.0);
        System.out.println("Cylinder:");
        System.out.println(cylinder);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
