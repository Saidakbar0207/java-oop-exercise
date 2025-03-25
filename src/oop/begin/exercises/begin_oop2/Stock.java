package oop.begin.exercises.begin_oop2;

 public class Stock {
     String symbol;
     String name;
     double previousClosingPrice;
     double currentClosingPrice;
     Stock() {

     }
     Stock(String symbol, String name, double previousClosingPrice, double currentClosingPrice) {
         this.symbol = symbol;
         this.name = name;
         this.previousClosingPrice = previousClosingPrice;
         this.currentClosingPrice = currentClosingPrice;
     }
     String getCurrentClosingPrice() {
         double a=currentClosingPrice;
         double b=previousClosingPrice;
         double c=(Math.abs(a-b)/b)*100;
         return String.format("%.2f", c);
     }


}
