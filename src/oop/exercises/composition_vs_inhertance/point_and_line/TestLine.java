package oop.exercises.composition_vs_inhertance.point_and_line;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0,3, 4);
        System.out.println(l1);
        Point p1 = new Point(10, 20);
        Point p2 = new Point(15, 25);
        Line l2 = new Line(p1, p2);
        System.out.println(l2);
        System.out.println(l1.getGradient());
        System.out.println(l1.getLength());

    }
}
