package oop.begin.exercises.begin_oop6;

public class Main {
    public static void main(String[] args) {
        LinearEquation equation = new LinearEquation();
        equation.setA(1);
        equation.setB(2);
        equation.setC(3);
        equation.setD(4);
        equation.setE(5);
        equation.setF(6);
        System.out.println(equation.isSolvable());
        System.out.println("x = " + equation.getX());
        System.out.println("y = " + equation.getY());
    }
}
