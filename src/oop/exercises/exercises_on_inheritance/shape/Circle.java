package oop.exercises.exercises_on_inheritance.shape;

public class Circle  extends Shape {
    private double radius;
    Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.radius=radius;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape" +
                "[color=" + getColor() +
                ", filled=" + isFilled() +
                "],radius=" + radius +
                ']';
    }

}
