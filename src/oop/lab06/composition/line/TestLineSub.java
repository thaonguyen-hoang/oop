package oop.lab06.composition.line;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line1 = new LineSub(1,1, 2,3);
        System.out.println(line1);
        System.out.println("x of begin is " + line1.getBeginX());
        System.out.println("y of end is " + line1.getEndY());

        Point point1 = new Point(4, 4);
        Point point2 = new Point(-2, 3);
        LineSub line2 = new LineSub(point1, point2);
        System.out.println(line2);

        System.out.println("begin point is " + line2.getBegin());
        System.out.println("end point is " + line2.getEnd());
    }
}
