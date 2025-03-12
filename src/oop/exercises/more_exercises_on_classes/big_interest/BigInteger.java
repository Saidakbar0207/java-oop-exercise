package oop.exercises.more_exercises_on_classes.big_interest;

public class BigInteger {
    private java.math.BigInteger num1;
    private java.math.BigInteger num2;
    public BigInteger(String num1, String num2) {
        this.num1 = new java.math.BigInteger(num1);
        this.num2 = new java.math.BigInteger(num2);
    }
    public java.math.BigInteger add() {
        return num1.add(num2);
    }
    public java.math.BigInteger subtract() {
        return num1.subtract(num2);
    }
    public java.math.BigInteger multiply() {
        return num1.multiply(num2);
    }

    @Override
    public String toString() {
        return "BigInterest{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
