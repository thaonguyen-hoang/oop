package oop.lab06.composition.line;

public class LineSub extends Point {
    private Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Line: begin = ").append(super.toString())
                .append(", end = ").append(end.toString());
        return description.toString();
    }

    public Point getBegin() {
        return new Point(getBeginX(), getBeginY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setXY(begin.getX(), begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Getters
    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    // Setters
    public void setBeginX(int beginX) {
        setX(beginX);
    }

    public void setBeginY(int beginY) {
        setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        setXY(beginX, beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setXY(endX, endY);
    }

    public double getLength() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getEndX() - getEndY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = getBeginX() - getEndX();
        int yDiff = getEndX() - getEndY();
        return Math.atan2(yDiff, xDiff);
    }

}
