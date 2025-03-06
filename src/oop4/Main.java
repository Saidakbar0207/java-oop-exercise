package oop4;

public class Main {
    public static void main(String[] args) {
        RegularPolygon regular = new RegularPolygon();
        regular.setSide(4);
        regular.setN(6);
        System.out.println("Area = "+regular.getArea());
        System.out.println("Perimeter = "+regular.getPerimeter());
        regular = new RegularPolygon(10, 4,5.6,7.8);
        System.out.println("Area = "+regular.getArea());
        System.out.println("Perimeter = "+regular.getPerimeter());


    }
}
