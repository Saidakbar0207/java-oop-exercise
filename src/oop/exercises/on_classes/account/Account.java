package oop.exercises.on_classes.account;

public class Account {
    private String id;
    private String name;
    private int balance=0;
    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount){
        if(amount<=balance){
            this.balance -= amount;
        } else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int transferTo(Account another,int amount){
        if(amount<=balance){
            this.balance -= amount;
           another.debit(amount);
        } else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
