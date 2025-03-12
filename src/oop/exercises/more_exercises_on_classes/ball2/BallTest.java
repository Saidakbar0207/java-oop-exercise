package oop.exercises.more_exercises_on_classes.ball2;

public class BallTest {
    public static void main(String[] args) {
        Ball ball=new Ball(2.5f,4.5f,6.5f);
        System.out.println(ball);
        Player player = new Player(10,3.5f,7.5f);
        System.out.println(player);
        System.out.println(ball.toString());
        System.out.println(player.toString());
        System.out.println(player.near(ball));




    }
}
