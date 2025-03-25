package oop.exercises.inheritance.circle;

import java.awt.*;

public class Cylinder extends Circle {
    private double height = 1.0 ;
    public Cylinder() {}
    public Cylinder(double radius) {}
    public Cylinder(double radius, double height) {
        this.height = height;
    }
    public Cylinder(double radius, double height, Color color) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString()+
                "height=" + height ;
    }

}
