package classes.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal pig = new Pig();

        animal.animalSound();
        cat.animalSound();
        dog.animalSound();
        pig.animalSound();
    }
}
