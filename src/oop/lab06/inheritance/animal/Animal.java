package oop.lab06.inheritance.animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Animal[name = ").append(name).append("]");
        return description.toString();
    }
}
