package oop.exercises.more_exercises_on_classes.mycomplex;

public class MyComplexApp {
    public static void main(String[] args) {
        MyComplex myComplex = new MyComplex(1.1,2.2);
        System.out.println(myComplex);
        System.out.println(myComplex.getImag());
        System.out.println(myComplex.getReal());
        System.out.println(myComplex.addInto(myComplex));
        System.out.println(myComplex.addNew(myComplex));
        System.out.println(myComplex.magnitude(3.3,4.4));
    }
}
