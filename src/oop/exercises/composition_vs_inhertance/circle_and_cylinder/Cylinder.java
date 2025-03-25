package oop.exercises.composition_vs_inhertance.circle_and_cylinder;

public class Cylinder {
    private Circle base;
    private double height;
    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
    public Circle getBase() {
        return base;
    }
    public void setBase(Circle base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
    public Cylinder() {
        base = new Circle(1.0, "black");
    }


}
