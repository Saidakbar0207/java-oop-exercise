package oop.exercises.composition.customer_invoice;

public class Invoice {
    private int id;
    Customer customer;
    private double amount;
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        return customer.getDiscount();
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ", customer=" + getCustomerName()+
                '('+getCustomerId()+')'+'('+getAmountAfterDiscount()+"%)"+
                ", amount=" + amount +
                ']';
    }
}
