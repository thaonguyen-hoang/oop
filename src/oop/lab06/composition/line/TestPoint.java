package oop.lab06.composition.line;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        System.out.println(point1);

        point1.setXY(100, 10);
        System.out.println("x = " + point1.getX());
        System.out.println("y = " + point1.getY());
    }
}
