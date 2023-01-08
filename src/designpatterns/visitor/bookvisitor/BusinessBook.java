package designpatterns.visitor.bookvisitor;

public class BusinessBook extends Book {
    private String publisher;
    public BusinessBook(double price, String publisher) {
        super(price);
        this.publisher = publisher;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getPublisher() {
        return publisher;
    }
}
