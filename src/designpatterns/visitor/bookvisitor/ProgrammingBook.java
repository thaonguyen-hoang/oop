package designpatterns.visitor.bookvisitor;

public abstract class ProgrammingBook extends Book {
    protected String resource;
    public ProgrammingBook(double price, String resource) {
        super(price);
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
