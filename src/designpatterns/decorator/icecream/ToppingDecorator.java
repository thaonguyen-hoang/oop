package decorator.icecream;

public abstract class ToppingDecorator extends IceCream {
    protected IceCream iceCream;

    @Override
    public String getDescription() {
        return iceCream.description;
    }

    public abstract String addTopping();
}
