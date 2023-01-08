package oop.lab05.composition.myshape;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint v1 = new MyPoint();
        MyPoint v2 = new MyPoint(1, 2);
        MyPoint v3 = new MyPoint(3, 4);
        MyTriangle triangle1 = new MyTriangle(v1, v2, v3);
        System.out.println(triangle1);
        System.out.println("type: " + triangle1.getType());

        MyTriangle triangle2 = new MyTriangle(0,0,0,-1,1,0);
        System.out.println(triangle2);
        System.out.println("type: " + triangle2.getType());
        System.out.println("perimeter: " + triangle2.getPerimeter());
    }
}
