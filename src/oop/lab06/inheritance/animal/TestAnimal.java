package oop.lab06.inheritance.animal;

public class TestAnimal {
    private Animal[] animals;
    private int numberOfAnimal;
    private int availIndex;

    public TestAnimal() {
        numberOfAnimal = 10;
        animals = new Animal[numberOfAnimal];
        availIndex = 0;
    }

    public void add(Animal animal) {
        animals[availIndex] = animal;
        availIndex++;
    }

    public Dog[] filterDog() {
        Dog[] dogs = new Dog[animals.length];
        int index = 0;
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogs[index] = (Dog) animal;
                index++;
            }
        }
        return dogs;
    }

    public static void main(String[] args) {
        TestAnimal animals = new TestAnimal();

        Dog animal1 = new Dog("Ben");
        animals.add(animal1);

        Cat animal2 = new Cat("Sue");
        animals.add(animal2);

        Mammal animal3 = new Dog("Charlie");
        animals.add(animal3);

        System.out.println(animal1.getName() + " greets " + animal3.getName());
        animal1.greets((Dog) animal3);

        System.out.println("say hello to " + animal2.getName());
        animal2.greets();
    }
}
