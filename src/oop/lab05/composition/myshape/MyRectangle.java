package oop.lab05.composition.myshape;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopRight() {
        return new MyPoint(bottomRight.getX(), topLeft.getY());
    }

    public MyPoint getBottomLeft() {
        return new MyPoint(topLeft.getX(), bottomRight.getY());
    }

    public double getLength() {
        return topLeft.distance(getTopRight());
    }

    public double getWidth() {
        return topLeft.distance(getBottomLeft());
    }

    public double getDiagonal() {
        return topLeft.distance(bottomRight);
    }

    public double getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public boolean isSquare() {
        return Double.compare(getLength(), getWidth()) == 0;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("MyRectangle[topLeft = ").append(topLeft)
                .append(", bottomRight = ").append(bottomRight).append("]");
        return description.toString();
    }
}
