package main.java.com.ohgiraffers.understand.chap03;

public class Customer {
    private String cName; // 고객 이름
    private String id; // 고객 id

    public Customer() {
    }

    public Customer(String cName, String id) {
        this.cName = cName;
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    Order order = new Order();

    public void addOrder(Product product){
        order.listUp(product);
    };

    public void viewOrder(){


        /*order.totalPrice(product);
        System.out.println("총 금액은 " + order.totalAll + "입니다.");*/
    };

}
