package oop.exercises.polymorphism.shape;

public  class Rectangle extends Shape{
  protected double width = 1.0;
  protected double length = 1.0;
  public Rectangle(){};
  public Rectangle(double width, double length){
    this.width = width;
    this.length = length;
  }
  public Rectangle(double width, double length, String color, Boolean filled){
    super(color, filled);
    this.width = width;
    this.length = length;
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
    @Override public double getArea() {
        return width * length;
    }
    @Override public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override public String toString() {
        return "Rectangle["+super.toString()+", width="+width+", length="+length+']';
    }
}
