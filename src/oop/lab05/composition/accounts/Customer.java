package oop.lab05.composition.accounts;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append(name).append("(").append(id).append(")");
        return description.toString();
    }
}
