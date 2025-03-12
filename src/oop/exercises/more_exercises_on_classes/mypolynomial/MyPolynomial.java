package oop.exercises.more_exercises_on_classes.mypolynomial;

public class MyPolynomial {
    private double[] coeffs;
    MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length-1;
    }

    @Override
    public String toString() {
    StringBuilder str = new StringBuilder();
    for (int i = coeffs.length-1; i >=0; i--) {
        if(coeffs[i] != 0){
            str.append(coeffs[i]);
            if(i>0) str.append("x^").append(i);
        }
    }
    return str.toString();
    }
    public double evaluate(double x) {
        double result = 0;
        double power =1;
        for(double coeff : coeffs){
            result += coeff*power;
            power *= x;
        }
        return result;
    }
    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            newCoeffs[i] += this.coeffs[i]; // Eski polinomni qo'shish
        }
        for (int i = 0; i <= another.getDegree(); i++) {
            newCoeffs[i] += another.coeffs[i]; // Yangi polinomni qo'shish
        }

        return new MyPolynomial(newCoeffs);
    }

    // 6. Polinom ko'paytirish
    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j]; // Ko'paytirish
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}
