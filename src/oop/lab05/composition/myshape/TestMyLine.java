package oop.lab05.composition.myshape;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 0);
        MyPoint point2 = new MyPoint(0, 4);
        MyLine line1 = new MyLine(point1, point2);
        System.out.println(line1);

        line1.setBeginXY(1, 2);
        System.out.println(line1);

        System.out.println("x of begin is: " + line1.getBeginX());
        System.out.println("y of begin is: " + line1.getBeginXY()[1]);
        System.out.println("x of end is: " + line1.getEndXY()[0]);
        System.out.println("y of end is: " + line1.getEndY());

        MyLine line2 = new MyLine(0, 4, 3, 1);
        System.out.println(line2);

        System.out.println("length of line 1: " + line1.getLength());
        System.out.println("radian of line 2: " + line2.getRadian());
    }
}
