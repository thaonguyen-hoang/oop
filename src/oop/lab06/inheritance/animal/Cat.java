package oop.lab06.inheritance.animal;

public class Cat extends Mammal {

    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Cat[").append(super.toString()).append("]");
        return description.toString();
    }
}
