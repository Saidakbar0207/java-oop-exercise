package oop.exercises.polymorphism.geometric_object;

public class TestClass {
    public static void main(String[] args) {
        GeometricObject[] objects = {new Circle(1.0), new Rectangle(2.0, 3.0)};
        for (GeometricObject object : objects) {
            System.out.println(object);
        }
        System.out.println("Perimeter of the circle: " + objects[0].getPerimeter());
        System.out.println("Area of the circle: " + objects[0].getArea());
        System.out.println("Perimeter of the rectangle: " + objects[1].getPerimeter());
        System.out.println("Area of the rectangle: " + objects[1].getArea());
    }
}
