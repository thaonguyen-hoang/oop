package designpatterns.visitor.bookvisitor;

public class DesignPatternBook extends ProgrammingBook {
    private String bestSeller;
    public DesignPatternBook(double price, String resource, String bestSeller) {
        super(price, resource);
        this.bestSeller = bestSeller;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getBestSeller() {
        return bestSeller;
    }
}
