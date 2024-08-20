package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String pName; // 제품 이름
    private int price; // 제품 가격
    private int amount; // 수량


    public Product(String pName, int price, int amount) {
        this.pName = pName;
        this.price = price;
        this.amount = amount;
    }


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{ " +
                "pName = '" + pName + '\'' +
                ", price = " + price +
                ", amount = " + amount +
                "} ";
    }


}
