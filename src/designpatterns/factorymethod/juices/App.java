package designpatterns.factorymethod.juices;

public class App {
    public static void main(String[] args) {
        FruitFactory factory = new FruitFactory();

        Fruit apple = factory.provideFruit("apple");
        apple.produceJuice();
        Fruit banana = factory.provideFruit("banana");
        banana.produceJuice();
        Fruit orange = factory.provideFruit("orange");
        orange.produceJuice();
    }
}
