package designpatterns.abstractfactory.shapefactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("rounded shape")) {
            return new RoundedShapeFactory();
        }
        return new NormalShapeFactory();
    }
}
