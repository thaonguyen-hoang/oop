package designpatterns.abstractfactory.shapefactory;

public class NormalRectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a rectangle!");
    }
}
