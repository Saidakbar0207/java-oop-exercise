package oop.exercises.on_classes.date;

public class TestMain {
    public static void main(String[] args) {
        Date d1=new Date(1,2,2024);
        System.out.println(d1);
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);
        System.out.println("Month: "+d1.getMonth());
        System.out.println("Day: "+d1.getDay());
        System.out.println("Year: "+d1.getYear());
        d1.setDate(3,4,2016);
        System.out.println(d1);
    }
}
