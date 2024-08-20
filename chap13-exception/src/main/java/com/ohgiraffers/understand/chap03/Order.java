package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> orderList = new ArrayList<>();
    OrderItem orderItem = new OrderItem();
    int total;

    public void listUp(Product product, int amount){
        // System.out.println("order : " + product);
        orderList.add(product);

        total += orderItem.total(product, amount);
        // System.out.println("order : " + total);

    }

    public boolean viewUp(){

        if(orderList.isEmpty()){

            return false;
        }else {
            System.out.println("== 주문 내역 == ");
            for (int i = 0; i < orderList.size(); i++) {
                System.out.println("제품명 : " + orderList.get(i).getpName() + " | 가격 : " + orderList.get(i).getPrice() + " | 재고 : " + orderList.get(i).getAmount());

            }
            return true;
        }


    }


}
