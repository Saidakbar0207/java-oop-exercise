package oop.exercises.polymorphism.movable3;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public String toString() {
        return center.toString()+",radius="+radius+']';

    }
    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }
    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }
    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }
    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
