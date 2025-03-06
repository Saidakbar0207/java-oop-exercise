package oop2;

public class Main {
    public static void main(String[] args) {
        Stock stock=new Stock();
        stock.symbol="ORCL";
        stock.name="Oracle Corporation";
        stock.previousClosingPrice=34.5;
         stock.currentClosingPrice=34.35;
        System.out.println(stock.getCurrentClosingPrice());

    }
}
