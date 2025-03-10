package more_exercises_on_classes.my_time;

import exercise_on_classes.time.Time;

public class MyTime {
    private int hour=0;
    private int minute=0;
    private int second=0;
    MyTime(){

    }
    MyTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public  void setTime(int hour, int minute, int second ){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour() {
        if(hour>=0 && hour<24) {
            return hour;
        } else {
            System.out.println("Invalid validation");
            return 0;
        }
    }
    public int getMinute() {
        if(minute>=0 && minute<60) {
            return minute;
        } else {
            System.out.println("Invalid validation");
            return 0;
        }
    }
    public int getSecond() {
        if(second>=0 && second<59){
            return second;
        } else {
        System.out.println("input validation");
        return 0;
        }
    }
    public void setHour(int hour) {
        if(hour>=0 && hour<24) {
            this.hour = hour;
        } else {
            System.out.println("input validation");
        }
    }
    public void setMinute(int minute) {
        if(minute>=0 && minute<59){
            this.minute = minute;
        } else {
            System.out.println("input validation");
        }
    }
    public void setSecond(int second) {
        if(second>=0 && second<59) {
            this.second = second;
        } else {
            System.out.println("input validation");
        }
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public MyTime nextSecond(){
        setSecond(getSecond()+1);
        return this;

    }
    public MyTime nextMinute(){
        setMinute(getMinute()+1);
        return this;
    }
    public MyTime nextHour(){
        setHour(getHour()+1);
        return this;

    }
    public MyTime previousSecond(){
       setSecond(getSecond()-1);
       return this;
    }
    public MyTime previousMinute(){
        setMinute(getMinute()-1);
        return this;
    }
    public MyTime previousHour(){
        setHour(getHour()-1);
        return this;
    }
}


