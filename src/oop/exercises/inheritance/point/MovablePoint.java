package oop.exercises.inheritance.point;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint() {}

    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        float[] floats = { xSpeed, ySpeed };
        setxSpeed(floats[0]);
        setySpeed(floats[1]);
    }
   public float[] getSpeed() {
        float[] floats = { xSpeed, ySpeed };
        return floats;
   }

    @Override
    public String toString() {
        return '('+getX()+','+getY()+"),speed=("+
                getxSpeed()+','+getySpeed()+')';
    }
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
