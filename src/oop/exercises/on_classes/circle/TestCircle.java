package oop.exercises.on_classes.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius()+" and area of " + c1.getArea());
        Circle c2 = new Circle();
        c2.setRadius(2.0);
        System.out.println("The circle has radius of " + c2.getRadius()+" and area of " + c2.getArea());
        Circle c3 = new Circle();
        c3.setRadius(3.0);
        System.out.println("The circle has radius of " + c3.getRadius()+" and area of " + c3.getArea());


    }
}
