package oop.lab05.composition.myshape;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("MyTriangle[v1 = ").append(v1)
                .append(", v2 = ").append(v2)
                .append(", v3 = ").append(v3).append("]");
        return description.toString();
    }

    public double getPerimeter() {
        double e12 = v1.distance(v2);
        double e23 = v2.distance(v3);
        double e31 = v3.distance(v1);
        return e12 + e23 + e31;
    }

    public String getType() {
        double e12 = v1.distance(v2);
        double e23 = v2.distance(v3);
        double e31 = v3.distance(v1);

        if (Double.compare(e12, e23) == 0
                && Double.compare(e23, e31) == 0) {
            return "equilateral";
        } else if(Double.compare(e12, e23) != 0
                && Double.compare(e23, e31) != 0
                && Double.compare(e31, e12) != 0) {
            return "scalene";
        } else {
            return "isosceles";
        }
    }
}
