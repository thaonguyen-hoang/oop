package oop.lab05.composition.book_info2;

public class TestMain {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "paulTan@nowhere.com", 'm');

        Book javaDummy = new Book("Java for dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
