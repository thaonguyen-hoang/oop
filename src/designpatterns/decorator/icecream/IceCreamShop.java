package decorator.icecream;

import java.util.LinkedList;
import java.util.List;

public class IceCreamShop {
    public static void main(String[] args) {
        List<IceCream> iceCreamsBox = getOrder();
        for (IceCream iceCream : iceCreamsBox) {
            System.out.println(iceCream.getDescription());
        }
    }

    public static List<IceCream> getOrder() {
        List<IceCream> iceCreamsBox = new LinkedList<>();
        IceCream iceCream1 = new HoneyToppingDecorator(new VanillaIceCream());
        IceCream iceCream2 = new NutsToppingDecorator(new ChocolateIceCream());
        IceCream iceCream3 = new HoneyToppingDecorator(
                new NutsToppingDecorator(new StrawberryIceCream()));

        iceCreamsBox.add(iceCream1);
        iceCreamsBox.add(iceCream2);
        iceCreamsBox.add(iceCream3);

        return iceCreamsBox;
    }
}
