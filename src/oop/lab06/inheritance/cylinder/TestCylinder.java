package oop.lab06.inheritance.cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder shape1 = new Cylinder(2.0, 3.0);
        System.out.println(shape1);

        Cylinder shape2 = new Cylinder();
        shape2.setColor("yellow");
        shape2.setHeight(3.5);
        System.out.println(shape2);
        System.out.println("area is: " + shape2.getArea());

        Circle shape3 = new Cylinder(2.0);
        System.out.println(shape3);
        System.out.println("area is: " + shape3.getArea());
        System.out.println("volume is: " + ((Cylinder) shape3).getVolume());
    }
}
