package designpatterns.abstractfactory.shapefactory;

public class NormalShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("rectangle")) {
            return new NormalRectangle();
        } else if (type.equalsIgnoreCase("square")) {
            return new NormalSquare();
        }
        return null;
    }
}
