package oop.exercises.exercises_on_composition.mytriangle;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle myTriangle=new MyTriangle(1,2,3,4,5,6);
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.toString());
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.equals(myTriangle));




    }
}
