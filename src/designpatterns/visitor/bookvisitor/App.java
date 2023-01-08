package designpatterns.visitor.bookvisitor;

public class App {
    public static void main(String[] args) {
        ConcreteVisitor visitor = new ConcreteVisitor();

        Book businessBook = new BusinessBook(50.0, "DHQG");
        businessBook.accept(visitor);
        System.out.println();

        Book designPatternBook = new DesignPatternBook(60.0, "Store", "HeadFirst");
        designPatternBook.accept(visitor);
        System.out.println();

        Book javaCoreBook = new JavaCoreBook(70.0, "Store", "Google");
        javaCoreBook.accept(visitor);
        System.out.println();

        System.out.println("Total price: " + visitor.getTotalPrice());
    }
}
