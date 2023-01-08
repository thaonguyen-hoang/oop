package oop.lab08.resizable_object;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject object1 = new Circle(3.2);
        System.out.println(object1);
        System.out.printf("area: %.2f\n", object1.getArea());
        System.out.printf("perimeter: %.2f\n", object1.getPerimeter());
    }
}
