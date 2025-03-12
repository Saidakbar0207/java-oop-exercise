package oop.exercises.exercises_on_composition.customer_account;

public class Account {
    private int id;
    Customer customer;
    private double balance=0.0;
    Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return customer.getName()  +
                "(" + id +')'+
                "balance="+balance+
                "%2.0f";
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public Account deposit(double amount) {
        balance += amount;
        return this;
    }
    public Account withdraw(double amount) {
        if(balance>=amount) {
            balance -= amount;
        } else {
            System.out.println("amount withdeawn exceeds the current balance!");
        }
        return this;
    }

}
