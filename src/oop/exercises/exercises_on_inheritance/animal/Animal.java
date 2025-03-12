package oop.exercises.exercises_on_inheritance.animal;

public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal[" +
                "name='" + name  +
                ']';
    }
}
