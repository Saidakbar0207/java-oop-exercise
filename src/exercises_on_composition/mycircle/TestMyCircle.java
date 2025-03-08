package exercises_on_composition.mycircle;

public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle();
        myCircle=(MyCircle)myCircle;
        myCircle.setRadius(12);

        System.out.println(myCircle.getRadius());
        System.out.println(myCircle.getArea());

    }
}
