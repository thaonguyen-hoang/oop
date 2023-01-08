package designpatterns.visitor.shapevisitor;

public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getRadius() {
        return radius;
    }
}
