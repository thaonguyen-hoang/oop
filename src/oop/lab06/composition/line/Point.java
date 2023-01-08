package oop.lab06.composition.line;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] point = {x, y};
        return point;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Point: (").append(x).append(", ")
                .append(y).append(")");
        return description.toString();
    }
}
