package oop.lab08.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Animal lily = new Cat("Lily");
        System.out.println("Lily wants to say hi!");
        lily.greets();

        Animal alex = new Dog("Alex");
        System.out.println("Alex wants to say hi!");
        alex.greets();

        Dog bill = new Dog("Bill");
        System.out.println("Bill wants to say hi!");
        bill.greets();
        System.out.println("Bill wants to say hi to Alex!");
        bill.greets((Dog) alex);


        Animal candy = new BigDog("Candy");
        System.out.println("Candy wants to say hi!");
        candy.greets();
        System.out.println("Candy wants to say hi to Bill!");
        ((Dog) candy).greets(bill);
        BigDog dan = new BigDog("Dan");
        System.out.println("Candy wants to say hi to Dan!");
        ((BigDog) candy).greets(dan);


    }
}
