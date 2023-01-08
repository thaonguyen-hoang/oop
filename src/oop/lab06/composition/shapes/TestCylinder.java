package oop.lab06.composition.shapes;

public class TestCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        System.out.println(circle);
        circle.setColor("yellow");

        System.out.println("radius is: " + circle.getRadius());
        System.out.println("color is: " + circle.getColor());
        System.out.printf("circle area is: %.2f\n", circle.getArea());

        Cylinder cylinder = new Cylinder(circle, 2.5);
        System.out.println(cylinder);
        System.out.printf("base area is: %.2f\n", cylinder.getBaseArea());
        System.out.printf("surface area is: %.2f\n", cylinder.getArea());
        System.out.printf("volume is: %.2f\n", cylinder.getVolume());
    }
}
