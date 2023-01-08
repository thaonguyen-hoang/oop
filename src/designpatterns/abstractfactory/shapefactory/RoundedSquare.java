package designpatterns.abstractfactory.shapefactory;

public class RoundedSquare extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a rounded square!");
    }
}
