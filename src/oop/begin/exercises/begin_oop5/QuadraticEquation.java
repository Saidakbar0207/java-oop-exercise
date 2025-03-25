package oop.begin.exercises.begin_oop5;

public class QuadraticEquation {
    private int a, b, c;

    QuadraticEquation() {

    }
    QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    int getDiscriminant() {
        return (b*b - 4*a*c);
    }
    void getRoot() {
        if (getDiscriminant() ==0) {
            System.out.println(getRoot1());
        }else if(getDiscriminant()>0) {
            System.out.println(getRoot1());
            System.out.println(getRoot2());
        } else {
            System.out.println("The equation has no root!!!");
        }
    }
    double getRoot1(){
    return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    double getRoot2() {
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }


}
