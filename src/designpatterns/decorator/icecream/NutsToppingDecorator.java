package decorator.icecream;

public class NutsToppingDecorator extends ToppingDecorator {
    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return ", nuts on top";
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + addTopping();
    }
}
