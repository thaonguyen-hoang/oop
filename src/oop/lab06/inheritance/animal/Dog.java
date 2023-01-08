package oop.lab06.inheritance.animal;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Dog[").append(super.toString()).append("]");
        return description.toString();
    }
}
