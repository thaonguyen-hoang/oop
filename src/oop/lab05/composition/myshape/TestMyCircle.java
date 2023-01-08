package oop.lab05.composition.myshape;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 0);
        MyCircle circle1 = new MyCircle(point1, 2);
        System.out.println(circle1);

        circle1.setCenterXY(1, 2);
        System.out.println(circle1);
        System.out.println("center is: " + circle1.getCenter());
        System.out.println("radius is: " + circle1.getRadius());

        MyCircle circle2 = new MyCircle(0, 4, 1);
        System.out.println(circle2);
        System.out.println("x of center: " + circle2.getCenterX());
        System.out.println("y of center: " + circle2.getCenterXY()[1]);

        System.out.println("distance: " + circle1.distance(circle2));
        System.out.println("area is: " + circle2.getArea());
        System.out.println("circumference is: " + circle2.getCircumference());
    }
}
