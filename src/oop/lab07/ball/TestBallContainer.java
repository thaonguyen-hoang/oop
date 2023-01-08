package oop.lab07.ball;

public class TestBallContainer {
    public static void main(String[] args) {
        Ball ball = new Ball(110, 100, 5, 10, 180);
        System.out.println(ball);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 3; step++) {
            ball.move();
            System.out.println(ball);
            box.collidesWith(ball);
            System.out.println(ball);
        }
    }
}
