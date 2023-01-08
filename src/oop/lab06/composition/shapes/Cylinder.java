package oop.lab06.composition.shapes;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(double radius, String color) {
        base.setRadius(radius);
        base.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBaseRadius() {
        return base.getRadius();
    }

    public double getBaseArea() {
        return base.getArea();
    }

    public double getArea() {
        return 2 * base.getRadius() * Math.PI * height + 2 * getBaseArea();
    }

    public double getVolume() {
        return height * getBaseArea();
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("[Cylinder").append(base.toString())
                .append(", height = ").append(height).append("]");
        return description.toString();
    }
}
