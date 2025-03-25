package oop.exercises.composition.mycircle;

public class MyCircle {
    private MyPoint center;
    private int radius=1;
    MyCircle(){
    }
    MyCircle(int x, int y,int radius){
        this.center=new MyPoint(x,y);
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        int[] xy=new int[2];
        xy[0]=center.getX();
        xy[1]=center.getY();
        return xy;
    }
    public void setCenterXY(int x,int y){
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[" +
                "radius=" + radius +
                ", center=(" +getCenterX()  +
                "," + getCenterY() +
                ")]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public double distance(MyCircle another){
    return another.getCenterX()-getCenterX();
    }
}
