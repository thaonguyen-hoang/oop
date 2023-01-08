package oop.lab06.inheritance.cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
        height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * getRadius() * Math.PI * height + 2 * super.getArea();
    }

    public double getVolume() {
        return height * super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height = " + height;
    }
}
