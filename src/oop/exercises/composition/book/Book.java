package oop.exercises.composition.book;

import java.util.Arrays;

public class Book {
    private String name;
    Author[] authors;
    private double price;
    private int qty=0;
    Book(String name,Author[] authors,double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    Book(String name,Author[] authors,double price,int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name=" + name +
                ", authors={\n" + Arrays.toString(authors) +
                ",name=" + authors.getClass().getName() +
                ",email=" + authors.getClass() +
                ",gender=" + authors.getClass() +
                "]}, price=" + price +
                ", qty=" + qty +
                ']'+"\n";

    }
        public String getAuthorNames(){
            return Arrays.toString(authors);

    }
}
