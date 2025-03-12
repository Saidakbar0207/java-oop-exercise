package oop.exercises.exercises_on_inheritance.point2d;

public class Point2D {
    private float x;
    private float y;
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    Point2D(){
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
    public void setXY(float x,float y){
        float[] floats = new float[2];
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] floats = new float[2];
        floats[0]=x;
        floats[1]=y;
        return floats;
    }
    @Override
    public String toString() {
        return '('+x+","+y+')';
    }
}
