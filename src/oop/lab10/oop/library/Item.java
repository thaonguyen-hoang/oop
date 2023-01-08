package oop.lab10.oop.library;

public abstract class Item {
    String title;
    int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Item[title = '").append(title)
                .append("', year = ").append(year).append("]");
        return description.toString();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
