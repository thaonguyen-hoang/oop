package designpatterns.visitor.shapevisitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {
    private int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        for (Shape shape : children) {
            shape.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("Draw a compound shape");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public int getId() {
        return id;
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
