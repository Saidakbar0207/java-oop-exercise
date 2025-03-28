package oop.exercises.composition.author;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        if (gender=='m' || gender=='f') return gender;
        else {
            System.out.println("Invalid gender");
            return 'u';
        }
    }



    @Override
    public String toString() {
        return "Author[" +
                "name=" + name +
                ", email=" + email +
                ", gender=" + gender +
                ']';
    }
}
