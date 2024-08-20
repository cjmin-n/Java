package main.java.com.ohgiraffers.understand.chap03;

public class OrderItem {

   /* private String pOrder; // 주문된 제품
    private int pAmount; // 주문된 수량*/

    public int total(Product product){
        int total = product.getPrice() * product.getAmount();
        return total;
    }
}
