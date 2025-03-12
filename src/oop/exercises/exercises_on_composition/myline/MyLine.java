package oop.exercises.exercises_on_composition.myline;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin() {
        return begin;
    }
    public MyPoint setBegin(MyPoint begin) {
        this.begin = begin;
        return begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public MyPoint setEnd(MyPoint end) {
        this.end = end;
        return end;
    }
     public int getBeginX() {
        return begin.getX();
     }
     public void setBeginX(int beginX) {
        this.begin.setX(beginX);
     }
     public int getBeginY() {
        return begin.getY();
     }
     public void setBeginY(int beginY) {
        this.begin.setY(beginY);
     }
     public int getEndX() {
        return end.getX();
     }
     public void setEndX(int endX) {
        this.end.setX(endX);
     }
     public int getEndY() {
        return end.getY();
     }
     public void setEndY(int endY) {
        this.end.setY(endY);
     }
     public int[] getBeginXY() {
        int[] xy = new int[2];
        xy[0] = begin.getX();
        xy[1] = begin.getY();
        return xy;
     }
     public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
     }
     public int[] getEndXY() {
        int[] xy = new int[2];
        xy[0] = end.getX();
        xy[1] = end.getY();
        return xy;
     }
     public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
     }
     public double getLength() {
        return end.getX() - begin.getX();
     }
     public double getGradient(){
        return Math.atan2(end.getY() - begin.getY(), begin.getX() - begin.getX());
    }

    @Override
    public String toString() {
        return "MyLine[" +
                "begin=(" + getBeginX() +
                ", " + getBeginY() +
                ", end=" + getEndX() +
                ", " + getEndY() +
                ')';
    }
}
