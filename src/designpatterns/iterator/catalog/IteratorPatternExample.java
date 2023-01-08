package designpatterns.iterator.catalog;
public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog =
                new ProductCatalog(new String[]{"Red", "Green", "Yellow"});
        for (Iterator iterator = productCatalog.getIterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}