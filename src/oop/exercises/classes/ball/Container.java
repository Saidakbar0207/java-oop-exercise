package oop.exercises.classes.ball;

public class Container {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    Container(int x, int y, int width,int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 =width;
        this.y2 = height;
    }
    public int getX() {
        return x1;
    }
    public int getWidth() {
        return x2;
    }
    public int getY() {
        return y1;
    }
    public int getHeight() {
        return y2;
    }
    public boolean collides(Ball ball) {
        if(ball.getX()- ball.getRadius()<=this.x1  ||
        ball.getX()- ball.getRadius()>=this.x2  ){
            ball.reflectHorizontal();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container[(" +x1+','+y1+','+x2+','+y2+")]";
    }
}
