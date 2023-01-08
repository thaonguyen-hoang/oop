package oop.lab05.composition.transaction;

public class Customer {
    private int id;
    private String name;
    private int discount; // discount in percent

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(name).append("(")
                .append(id).append(")(")
                .append(discount).append("%)");
        return description.toString();
    }
}
