package exercise_on_classes.time;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour>=0 && hour <=23) {
            this.hour = hour;
        } else {
            System.out.println("No input validation needed.");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute>=0 && minute <=59) {
            this.minute = minute;
        } else {
            System.out.println("No input validation needed.");
        }
    }
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second >= 0 && second <=59) {
            this.second = second;
        } else {
            System.out.println("No input validation needed.");
        }
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d",hour,minute,second );
    }
    public Time nextSecond() {
        int newHour=hour,newMinute=minute,newSecond=second;
        newSecond++;
        if(newSecond==60) { newSecond=0 ; newMinute++;}
        if(newMinute==60) { newMinute=0; newHour++;}
        if(newHour==24) { newHour=0; }
        return new Time(newHour,newMinute,newSecond);
    }
    public Time previousSecond() {
        int newHour=hour,newMinute=minute,newSecond=second;
        newSecond--;
        if(newSecond==-1) { newSecond=59 ; newMinute--;}
        if(newMinute==-1) { newMinute=59; newHour--;}
        if(newHour==-1) { newHour=23; }
        return new Time(newHour,newMinute,newSecond);
    }
}
