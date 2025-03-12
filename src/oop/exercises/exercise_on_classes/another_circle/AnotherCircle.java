package oop.exercises.exercise_on_classes.another_circle;

public class AnotherCircle {
    private double radius;
    AnotherCircle() {
        this.radius = 1.0;
    }
    AnotherCircle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "exercise_on_classes.another_circle{" +
                "radius=" + radius +
                '}';
    }
}
