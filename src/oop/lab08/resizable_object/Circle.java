package oop.lab08.resizable_object;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Circle[radius = ").append(radius).append("]");
        return description.toString();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
