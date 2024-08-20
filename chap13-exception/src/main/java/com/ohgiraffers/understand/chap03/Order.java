package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> orderList = new ArrayList<>();

    int totalAll;
    OrderItem oi = new OrderItem();
    Product product = new Product();

    public void listUp(Product p){

        orderList.add(p);
        /*product.setAmount(product.getAmount() - p.getAmount());*/
        product.
        System.out.println(orderList); // 쌓임
        System.out.println(product.products);
    }

    public int totalPrice(Product p){

        totalAll += oi.total(p);
        return totalAll;
    }
}
