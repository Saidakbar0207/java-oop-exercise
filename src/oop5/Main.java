package oop5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quad = new QuadraticEquation();
         quad.setA(5);
         quad.setB(1);
         quad.setC(4);
        System.out.println("The discriminant of the equation is ->"+quad.getDiscriminant());
        System.out.println("The equation is ->"+quad.getRoot1());
        System.out.println("The equation is ->"+quad.getRoot2());


    }
}
