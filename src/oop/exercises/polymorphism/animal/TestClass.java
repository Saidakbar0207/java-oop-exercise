package oop.exercises.polymorphism.animal;

public class TestClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        cat.greets();

        Dog dog = new Dog("Bobby");
        dog.greets();
        dog.greets(dog);


        BigDog bigDog = new BigDog("Alabay");
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(bigDog);

    }
}
