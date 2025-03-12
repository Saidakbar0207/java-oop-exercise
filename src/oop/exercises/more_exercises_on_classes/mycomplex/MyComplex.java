package oop.exercises.more_exercises_on_classes.mycomplex;

public class MyComplex {
    private double real=0.0;
    private double imag=0.0;
    MyComplex(){

    }
    MyComplex(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real=real;
    }
    public double getImag(){
        return imag;
    }
    public void setImag(double imag){
        this.imag=imag;
    }
    public void setValue(double real, double imag){
        this.real=real;
        this.imag=imag;
    }

    @Override
    public String toString() {
        return "real=" + real +
                ", imag=" + imag ;
    }
    public boolean isReal(){
        if(imag==0){
            return true;
        }
        return false;
    }
    public boolean isImaginary(){
        if(real==0){
            return true;
        }
        return false;
    }
    public boolean equals(double real, double imag){
        return (this.real==real && this.imag==imag);
    }
    public boolean equals(MyComplex another){
        return (this.real==another.getReal() && this.imag==another.getImag());
    }
   public double magnitude(double x, double y){
        this.real=x;
        this.imag=y;
        return Math.sqrt(x*x+y*y);
   }
   public MyComplex addInto(MyComplex right){
        new MyComplex(real+right.real, imag+right.imag);
        return MyComplex.this;
   }
   public MyComplex addNew(MyComplex right){
        return new MyComplex(real+right.real, imag+right.imag);
   }


    
}
