package oop.lab06.inheritance.school_info;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Person[name = ").append(name)
                .append(", address = ").append(address).append("]");
        return description.toString();
    }
}
