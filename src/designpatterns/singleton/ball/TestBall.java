package designpatterns.singleton.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = Ball.getInstance("red");
        System.out.println(ball1);

        Ball ball2 = Ball.getInstance("red");
        System.out.println(ball2);

        Ball ball3 = Ball.getInstance("green");
        System.out.println(ball3);
    }
}
