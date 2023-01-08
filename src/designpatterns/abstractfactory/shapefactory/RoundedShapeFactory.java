package designpatterns.abstractfactory.shapefactory;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new RoundedRectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
