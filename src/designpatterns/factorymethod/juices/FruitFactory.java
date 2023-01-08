package designpatterns.factorymethod.juices;

public class FruitFactory {
    public Fruit provideFruit(String type) {
        if (type.equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (type.equalsIgnoreCase("banana")) {
            return new Banana();
        } else if (type.equalsIgnoreCase("orange")) {
            return new Orange();
        }
        return null;
    }
}
