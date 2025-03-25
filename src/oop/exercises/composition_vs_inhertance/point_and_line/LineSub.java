package oop.exercises.composition_vs_inhertance.point_and_line;

public class LineSub  extends Point {
    Point end;
    public LineSub(int beginX, int beginY,int endX, int endY) {
        super(beginX, beginY);
        this.end =new Point(endX, endY);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end =end;
    }
    public String toString() {
        return "Line: (" + getX() + ", " + getY() + ") -> (" + end.getX() + ", " + end.getY() + ")";
    }
    public Point getBegin() {
        return new Point(getX(), getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.setXY(begin.getX(), begin.getY());
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX(){
        return getX();
    }
    public int getBeginY(){
        return getY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public void setBeginX(int beginX){
        this.setX(beginX);
    }
    public void setBeginY(int beginY){
        this.setY(beginY);
    }
    public void setEndX(int endX){
        end.setX(endX);
    }
    public void setEndY(int endY){
        end.setY(endY);
    }
    public int getLength(){
        return (int)Math.sqrt(Math.pow(end.getX() - getX(), 2) + Math.pow(end.getY() - getY(), 2));
    }
    public double getGradient(){
        return Math.atan2(end.getY() - getY(), getX() - getX());
    }
}
