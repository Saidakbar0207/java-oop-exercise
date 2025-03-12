package oop.exercises.exercises_on_inheritance.animal;

public class Dog {
    public Dog(String name) {}
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
