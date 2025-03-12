package oop.begin.oop_exercise_begin_oop1.oop_exercise_begin_oop3;

  public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public Double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(Double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    double getMonthlyInterestRate() {
        return (annualInterestRate/12)/100;
    }
    double getMonthlyInterest() {
        return balance*getMonthlyInterestRate();
    }
    void withdraw(double amount) {
        balance -= amount;
        System.out.println(amount+" $ yechildi.Yangi balans :"+balance+" $");
    } void deposit(double amount) {
        balance += amount;
        System.out.println(amount+" $ qo'shildi.Yangi balans :"+balance+" $");
    }

}
