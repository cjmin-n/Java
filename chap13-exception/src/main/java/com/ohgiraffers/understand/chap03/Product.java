package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;

public class Product {

    private String pName; // 제품 이름
    private int price; // 제품 가격
    private int amount; // 수량

    ArrayList<Product> products = new ArrayList<>();


    public Product() {
        Product product1 = new Product("선글라스", 15000, 3);
        Product product2 = new Product("안경", 20000, 5);
        Product product3 = new Product("빨대", 1000, 100);
        Product product4 = new Product("고구마", 3000, 10);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

    }


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

    public void list(){


        for(Product product : products){
            System.out.println(product);
        }
    }
}
