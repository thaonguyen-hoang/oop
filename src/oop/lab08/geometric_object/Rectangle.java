package oop.lab08.geometric_object;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Rectangle[width = ").append(width)
                .append(", length = ").append(length).append("]");
        return description.toString();
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }
}
