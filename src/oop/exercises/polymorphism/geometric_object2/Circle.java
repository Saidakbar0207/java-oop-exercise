package oop.exercises.polymorphism.geometric_object2;

public class Circle implements GeometricObject {
    protected double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle["+radius+']';
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}

