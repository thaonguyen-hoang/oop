package designpatterns.abstractfactory.shapefactory;

public class NormalSquare extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a square!");
    }
}
