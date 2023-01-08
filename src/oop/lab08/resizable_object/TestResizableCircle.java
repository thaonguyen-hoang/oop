package oop.lab08.resizable_object;

public class TestResizableCircle {
    public static void main(String[] args) {
        GeometricObject object1 = new ResizableCircle(2.2);
        System.out.println(object1);
        System.out.println(object1.getPerimeter());
        System.out.println(object1.getArea());

        Resizable resizableObject = (Resizable) object1;
        resizableObject.resize(50);
        System.out.println(resizableObject);

        Circle circle1 = new ResizableCircle(1.0);
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        ((ResizableCircle) circle1).resize(120);
        System.out.println(circle1);
    }
}
