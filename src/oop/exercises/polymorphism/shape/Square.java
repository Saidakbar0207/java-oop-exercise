package oop.exercises.polymorphism.shape;

public class Square extends Rectangle{
    public Square(){};
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, Boolean filled){
        super(side, side, color, filled);
    }
    public double getSide() {
        return super.getWidth();
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setlength(side);
    }
    @Override public void setWidth(double side) {
        super.setWidth(side);
    }
    /*@Override
    public void setLength(double side) {
        super.setlength(side);
    }*/
    @Override public String toString() {
        return "Square["+super.toString()+", side="+getSide()+']';
    }




}
