package oop.exercises.composition.customer_account;

public class Customer {
    private final int id;
    private final String name;
    private final char gender;
    Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getGender() {
        if(gender == 'm' || gender == 'f')  return gender;
        else {
            System.out.println("Invalid gender");
            return 'u';
        }
    }

    @Override
    public String toString() {
        return  name  +
                "(" + id +
                ')';
    }
}
