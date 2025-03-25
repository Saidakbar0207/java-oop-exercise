package oop.begin.exercises.begin_oop1;

public class Main {
         public static void main(String[] args) {
             Rectangle rectangle = new Rectangle();
             Rectangle rectangle1 = new Rectangle();
             rectangle.height=4; rectangle.width=40;
             rectangle1.height=3.5; rectangle1.width=35.9;
             System.out.println("The area of the rectangle is "+rectangle.getArea());
             System.out.println("The perimeter of the rectangle is "+rectangle.getPerimeter());
             System.out.println("The area of the rectangle1 is "+rectangle1.getArea());
             System.out.println("The perimeter of the rectangle1 is "+rectangle1.getPerimeter());

         }
}
