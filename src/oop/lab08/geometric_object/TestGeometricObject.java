package oop.lab08.geometric_object;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject object1 = new Circle(1.1);
        System.out.println(object1);
        System.out.println("area: " + object1.getArea());
        System.out.println("perimeter: " + object1.getPerimeter());

        GeometricObject object2 = new Rectangle(2.3, 4.5);
        System.out.println(object2);
        System.out.println("area: " + object2.getArea());
        System.out.println("perimeter: " + object2.getPerimeter());
    }
}
