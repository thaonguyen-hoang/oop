package designpatterns.strategy.mathoperations;

public class ConcreteStrategySubtract implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
