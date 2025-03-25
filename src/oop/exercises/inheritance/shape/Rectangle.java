package oop.exercises.inheritance.shape;

public class Rectangle extends Shape {
    private double width;
    private double length;
    Rectangle() {
        width=1.0;
        length=1.0;
    }
    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width=width;
        this.length=length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getlength() {
        return length;
    }
    public void setlength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
        return "Rectangle[Shape" +
                "[color="+getColor()+
                ",filled="+isFilled()+
                "],width=" + width +
                ", length=" + length +
                "]]";
    }
}
