package more_exercises_on_classes.my_time;

public class MyTimeTest {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(23,59,59);
        System.out.println(myTime);
        myTime.setSecond(12);
        myTime.setMinute(9);
        myTime.setHour(13);
        System.out.println(myTime);
        System.out.println(myTime.nextSecond());
        System.out.println(myTime.nextMinute());
        System.out.println(myTime.nextHour());
        System.out.println(myTime.previousSecond());
        System.out.println(myTime.previousMinute());
        System.out.println(myTime.previousHour());

    }
}
