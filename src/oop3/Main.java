package oop3;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000.0);
        account.deposit(3000);
        account.withdraw(2500);
        account.setAnnualInterestRate(4.5);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Account monthly interest: " + account.getMonthlyInterest());


    }
}
