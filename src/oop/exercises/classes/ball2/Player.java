package oop.exercises.classes.ball2;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z=0.0f;
    Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public void move(float xDisp,float yDisp) {
        x += xDisp;
        y += yDisp;
    }
    public void jump(float zDisp){
        z += zDisp;
    }
    public boolean near(Ball ball) {
        int distance = (int) Math.sqrt(Math.pow((ball.getX() - x), 2) + Math.pow((ball.getY() - y), 2));
        if (distance < 8) {
            return true;
        } else {
            return false;
        }
    }
        public void kick(Ball ball){
        if(near(ball)){
            System.out.println("Kicking Ball");
        } else {
            System.out.println("Kicking don't Ball");
        }
        }
    }

