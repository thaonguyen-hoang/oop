package oop.lab06.inheritance.point;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println(point1);

        Point2D point2 = new Point2D(1.5f, 2.5f);
        System.out.println(point2);
        System.out.println("x = " + point2.getX());
        System.out.println("y = " + point2.getY());

        Point3D point3 = new Point3D();
        point3.setXY(3, 4);
        System.out.println(point3);

        Point2D point4 = new Point3D(2, 1, 1.5f);
        System.out.println(point4);
    }
}
