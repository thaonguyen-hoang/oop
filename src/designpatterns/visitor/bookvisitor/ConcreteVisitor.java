package designpatterns.visitor.bookvisitor;

public class ConcreteVisitor implements Visitor {
    private double totalPrice;

    public ConcreteVisitor() {
        this.totalPrice = 0.0;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void visit(BusinessBook book) {
        totalPrice += book.getPrice();
        System.out.println("Publisher: " + book.getPublisher());
        System.out.println("Price: " + book.getPrice());
    }

    @Override
    public void visit(DesignPatternBook book) {
        totalPrice += book.getPrice();
        System.out.println("Resource: " + book.getResource());
        System.out.println("Best Seller:" + book.getBestSeller());
        System.out.println("Price: " + book.getPrice());
    }

    @Override
    public void visit(JavaCoreBook book) {
        totalPrice += book.getPrice();
        System.out.println("Resource: " + book.getResource());
        System.out.println("Favorite book: " + book.getFavorite());
        System.out.println("Price: " + book.getPrice());
    }
}
