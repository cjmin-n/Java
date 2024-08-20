package main.java.com.ohgiraffers.understand.chap03;

public class Customer {
    private String cName; // 고객 이름
    private String id; // 고객 id


    public Customer(String cName, String id) {
        this.cName = cName;
        this.id = id;
    }


    Order order = new Order();

    int pAmount;

    int total;

    public int addOrder(Product product, int amount){



        pAmount = product.getAmount();
        if(pAmount >= amount){
            pAmount -= amount;

            System.out.println("구매에 성공했습니다. 남은 수량은 " + pAmount + "입니다.");

            order.listUp(product, amount);
        }else  {
            System.out.println("재고가 부족합니다.");
        }

        return pAmount;
    };

    public void viewOrder(){


        if(!order.viewUp()){
            System.out.println("주문한 내역이 없습니다. 주문해주세요!");

        }else {
            total = order.total;
            System.out.println("총 금액은 " + total + "입니다.");
        }


    };

}
