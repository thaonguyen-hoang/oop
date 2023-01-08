package designpatterns.strategy.mathoperations;

import java.util.Scanner;

public class TestStrategy {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an operation: ");
        String action = scan.nextLine();

        if (action.equalsIgnoreCase("add")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equalsIgnoreCase("subtract")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equalsIgnoreCase("multiply")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        System.out.print("Enter a: ");
        double a = scan.nextDouble();
        System.out.print("Enter b: ");
        double b = scan.nextDouble();
        System.out.printf("%.1f + %.1f = %.1f", a, b, context.execute(a,b));
    }
}
