package oop.lab07.ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width;
        y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Container[(").append(x1).append(", ").append(y1)
                .append("), speed = (").append(x2).append(", ")
                .append(y2).append(")]");
        return description.toString();
    }

    public boolean collidesWith(Ball ball) {
        if (y1 <= ball.getY() && ball.getY() <= y2) {
            if ((ball.getX() <= x1 && ball.getX() + ball.getRadius() >= x1) ||
                ball.getX() >= x2 && ball.getX() - ball.getRadius() <= x2) {
                ball.reflectHorizontal();
                return true;
            } else if (x1 <= ball.getX() && ball.getX() <= x2) {
                if ((ball.getX() - ball.getRadius() <= x1) ||
                    (ball.getX() + ball.getRadius() >= x2)) {
                    ball.reflectHorizontal();
                    return true;
                }
            }
        }

        if (x1 <= ball.getX() && ball.getX() <= x2) {
            if (ball.getY() <= y1 && ball.getY() + ball.getRadius() >= y1 ||
                ball.getY() >= y2 && ball.getY() - ball.getRadius() <= y2) {
                ball.reflectVertical();
                return true;
            } else if (ball.getY() >= y1 && ball.getY() <= y2) {
                if (ball.getY() - ball.getRadius() <= y1 ||
                    ball.getY() + ball.getRadius() >= y2) {
                    ball.reflectVertical();
                    return true;
                }
            }
        }
        return false;
    }
}
