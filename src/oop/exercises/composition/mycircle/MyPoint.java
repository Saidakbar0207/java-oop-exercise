package oop.exercises.composition.mycircle;

public class MyPoint {
    private int x=0;
    private int y=0;
    MyPoint() {

    }
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return  "("+ x +
                "," + y +
                ')';
    }

}

