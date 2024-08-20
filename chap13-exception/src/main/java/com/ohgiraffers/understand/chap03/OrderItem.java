package main.java.com.ohgiraffers.understand.chap03;

public class OrderItem {


    public int total(Product product, int amount){

        // System.out.println(product.getPrice() + " " + amount);
        int total = product.getPrice() * amount;
        // System.out.println(total);
        return total;
    }
}
