package designpatterns.factorymethod.juices;

public class Apple implements Fruit {
    @Override
    public void produceJuice() {
        System.out.println("Apple juice");
    }
}
