package exercises_on_composition.mytriangle;

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
    public double distance(int x, int y) {
      return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    @Override
    public String toString() {
        return  "("+ x +
                "," + y +
                ')';
    }

}

