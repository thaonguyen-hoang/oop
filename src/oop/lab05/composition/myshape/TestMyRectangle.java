package oop.lab05.composition.myshape;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 2);
        MyPoint bottomRight = new MyPoint(3, 1);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle);

        System.out.println("top-left corner is: " + rectangle.getTopLeft());
        System.out.println("top-right corner is: " + rectangle.getTopRight());
        System.out.println("bottom-left corner is: " + rectangle.getBottomLeft());
        System.out.println("bottom-right corner is: " + rectangle.getBottomRight());

        System.out.println("length is: " + rectangle.getLength());
        System.out.println("width is: " + rectangle.getWidth());
        System.out.println("diagonal is " + rectangle.getDiagonal());

        System.out.println("area is: " + rectangle.getArea());
        System.out.println("perimeter is: " + rectangle.getPerimeter());

        if (rectangle.isSquare()) {
            System.out.println("this is a square");
        } else {
            System.out.println("this is not a square");
        }
    }
}
