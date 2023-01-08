package designpatterns.iterator.catalog;

public class ProductIterator implements Iterator {
    private int position;
    private String[] productCatalog;

    public ProductIterator(String[] catalog) {
        productCatalog = catalog;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < productCatalog.length;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        return productCatalog[position++];
    }
}
