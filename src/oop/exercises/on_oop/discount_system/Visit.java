package oop.exercises.on_oop.discount_system;

import javax.xml.crypto.Data;

public class Visit {
    private Customer customer;
    private Data date;
    private double serviceExpense;
    private double productExpense;
    public Visit(String name,Data date) {
        this.customer=new Customer(name);
        this.date=date;
    }

    public Visit(Customer customer1) {
        this.customer=customer1;
    }

    public String getName() {
        return customer.getName();
    }
    public double getServiceExpense() {
        return serviceExpense;
    }
    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }
    public double getProductExpense() {
        return productExpense;
    }
    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }
    public double getTotalExpense() {
        // Xizmatlar va mahsulotlar uchun chegirmalar hisoblanadi
        double serviceDiscount = serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = productExpense * DiscountRate.getProductDiscountRate();

        // Umumiy xarajat hisoblanadi
        return (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
    }


    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
