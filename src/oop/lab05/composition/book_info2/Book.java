package oop.lab05.composition.book_info2;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Book[name = ").append(name)
                .append(", authors = {").append(authors[0]);

        for (int i = 1; i < authors.length; i++) {
            description.append(", ").append(authors[i]);
        }

        description.append("}, price = ").append(price)
                .append(", qty = ").append(qty)
                .append("]");
        return description.toString();
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author: authors) {
            authorNames.append(author).append(", ");
        }
        authorNames.delete(authors.length - 2, authors.length);
        return authorNames.toString();
    }
}
