package oop.lab05.classes;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        //balance += amount;
        return balance += amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Employee[id = ").append(id)
                .append(", name = ").append(name)
                .append(", balance = ").append(balance)
                .append("]");
        return description.toString();
    }
}
