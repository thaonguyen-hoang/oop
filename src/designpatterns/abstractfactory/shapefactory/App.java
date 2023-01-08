package designpatterns.abstractfactory.shapefactory;

public class App {
    public static void main(String[] args) {
        FactoryProducer producer = new FactoryProducer();

        AbstractFactory shapeFactory = producer.getFactory("normal");
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
        System.out.println();

        AbstractFactory roundedShapeFactory = producer.getFactory("roundedShape");
        Shape roundedRectangle = roundedShapeFactory.getShape("rectangle");
        roundedRectangle.draw();
        Shape roundedSquare = roundedShapeFactory.getShape("square");
        roundedSquare.draw();
    }
}
