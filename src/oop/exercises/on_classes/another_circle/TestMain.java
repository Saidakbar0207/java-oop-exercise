package oop.exercises.on_classes.another_circle;

import oop.exercises.on_classes.circle.Circle;

public class TestMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.1);
        Circle c2 = new Circle();
        c1.setRadius(2.2);
        System.out.println("radius is : " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

    }
}
