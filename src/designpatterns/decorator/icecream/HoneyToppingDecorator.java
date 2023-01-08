package decorator.icecream;

public class HoneyToppingDecorator extends ToppingDecorator {
    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return ", honey topping";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }
}
