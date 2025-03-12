package oop.exercises.exercises_on_inheritance.point;

public class Point {
    private float x;
    private float y;
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    Point(){
        x=0.0f;
        y=0.0f;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        float[] floats={x,y};
        this.x=floats[0];
        this.y=floats[1];
    }
    public float[] getXY() {
        float[] floats={x,y};
        return floats;
    }

    @Override
    public String toString() {
        return '('+x+","+y+')';
    }
}

