package oop.lab08.movable_object;

public class TestMovable {
    public static void main(String[] args) {
        Movable point1 = new MovablePoint(-2, 5, 3, 1);
        System.out.println(point1);

        point1.moveUp();
        System.out.println("Move up:");
        System.out.println(point1);

        point1.moveLeft();
        System.out.println("Move left:");
        System.out.println(point1);

        point1.moveDown();
        System.out.println("Move down:");
        System.out.println(point1);

        point1.moveRight();
        System.out.println("Move right:");
        System.out.println(point1);


        Movable circle1 = new MovableCircle(1, 1, 2, 2, 3);
        circle1.moveUp();
        System.out.println("Move up:");
        System.out.println(circle1);

        circle1.moveLeft();
        System.out.println("Move left:");
        System.out.println(circle1);

        circle1.moveDown();
        System.out.println("Move down:");
        System.out.println(circle1);

        circle1.moveRight();
        System.out.println("Move right:");
        System.out.println(circle1);


        Movable rectangle1 = new MovableRectangle(1, 1, 2, 2, 3, 3);
        rectangle1.moveUp();
        System.out.println("Move up:");
        System.out.println(rectangle1);

        rectangle1.moveLeft();
        System.out.println("Move left:");
        System.out.println(rectangle1);

        rectangle1.moveDown();
        System.out.println("Move down:");
        System.out.println(rectangle1);

        rectangle1.moveRight();
        System.out.println("Move right:");
        System.out.println(rectangle1);
    }
}
