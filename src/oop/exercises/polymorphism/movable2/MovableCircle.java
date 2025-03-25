package oop.exercises.polymorphism.movable2;

public class MovableCircle {
    private int radius;
    private MovablePoint center;
   public MovableCircle(int x,int y, int xSpeed, int ySpeed,int radius){
       this.radius=radius;
       this.center=new MovablePoint(x,y,xSpeed,ySpeed);
   }
   @Override
    public String toString() {
        return super.toString()+",radius="+radius+']';
    }
}
