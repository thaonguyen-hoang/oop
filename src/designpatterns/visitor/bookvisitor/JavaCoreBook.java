package designpatterns.visitor.bookvisitor;

public class JavaCoreBook extends ProgrammingBook {
    private String favorite;
    public JavaCoreBook(double price, String resource, String favorite) {
        super(price, resource);
        this.favorite = favorite;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getFavorite() {
        return favorite;
    }
}
