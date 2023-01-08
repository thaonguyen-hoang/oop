package designpatterns.factorymethod.juices;

public class Orange implements Fruit {
    @Override
    public void produceJuice() {
        System.out.println("Orange juice");
    }
}
