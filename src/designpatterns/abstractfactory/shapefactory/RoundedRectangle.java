package designpatterns.abstractfactory.shapefactory;

public class RoundedRectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a rounded rectangle!");
    }
}
