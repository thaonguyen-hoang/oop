package designpatterns.strategy.mathoperations;

public class Context {
    private Strategy strategy;

    public double execute(double a, double b) {
        return strategy.execute(a, b);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
