package oop.exercises.classes.mypolynomial;

public class MyPolynomialTest {
        public static void main(String[] args) {
            MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3); // 3.3x^2 + 2.2x + 1.1
            MyPolynomial p2 = new MyPolynomial(4.4, 5.5, 6.6, 7.7); // 7.7x^3 + 6.6x^2 + 5.5x + 4.4

            System.out.println("p1: " + p1);
            System.out.println("p2: " + p2);

            System.out.println("p1 darajasi: " + p1.getDegree());
            System.out.println("p2 darajasi: " + p2.getDegree());

            System.out.println("p1(2.0) = " + p1.evaluate(2.0));

            MyPolynomial p3 = p1.add(p2);
            System.out.println("p1 + p2 = " + p3);

            MyPolynomial p4 = p1.multiply(p2);
            System.out.println("p1 * p2 = " + p4);
        }
    }


