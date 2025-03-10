package more_exercises_on_classes.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };

    private static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid date");
        }
    }
    public boolean isLeapYear(int year){
        if((year%4==0 && year%100!=0) || year%400==0) return true;
        else return false;
    }
    public boolean isValidDate(int year, int month, int day){
        if(year>0 && year <10000 && isLeapYear(year) && month>0 && month<=12) return true;
        else return false;
    }
    public int getDayOfWeek(int year, int month, int day){
        if(month<3){
            month+=12;
            year--;
        }
        int k=year%100;
        int j=year/100;
        int h=(day +(13*(month+1))/5+k+(k/4)+(j/4)+(5*j))%7;
        return (h+6)%7;
    }
    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid date");
        }
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }
            day = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        int maxDays = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        if (day > maxDays) {
            day = maxDays;
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        int maxDays = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        if (day > maxDays) {
            day = maxDays;
        }
        return this;
    }

    public MyDate nextYear() {
        if (isValidDate(year + 1, month, day)) {
            year++;
        } else {
            year++;
            day = 28;
        }
        return this;
    }
    public MyDate previousYear() {
        if (isValidDate(year - 1, month, day)) {
            year--;
        } else {
            year--;
            day = 28;
        }
        return this;
    }
    }

