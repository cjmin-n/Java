package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int choice;

        Customer customer;

        OrderItem orderItem;

        List<Product> productList = new ArrayList();

        Product product1 = new Product("선글라스", 15000, 3);
        Product product2 = new Product("안경", 20000, 5);
        Product product3 = new Product("빨대", 1000, 100);
        Product product4 = new Product("고구마", 3000, 10);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);


        System.out.println("=== 온라인 상점을 위한 주문 관리 시스템 ===");
        System.out.println("이름을 입력해주세요.");
        String name = scr.nextLine();
        System.out.println("아이디를 입력해주세요.");
        String id = scr.nextLine();

        // Customer 클래스로 name, id 보내주기.
        customer = new Customer(name, id);

        while(true){
            System.out.println("번호를 선택해주세요.");
            System.out.println("1. 제품 목록 조회");
            System.out.println("2. 제품 주문하기");
            System.out.println("3. 주문 내역 조회");
            System.out.println("9. 프로그램 종료");
            choice = scr.nextInt();
            scr.nextLine();

            switch(choice){
                case 1 :
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println((i+1) + "번 - 제품명 : " + productList.get(i).getpName() + " | 가격 : " + productList.get(i).getPrice() + " | 재고 : " + productList.get(i).getAmount());
                    }

                    break;
                case 2 :
                    /*for(Product p : productList){
                        System.out.println(p);
                    }*/
                    for (int i = 0; i < productList.size(); i++) {
                        // System.out.println((i+1) + "번 - 제품명 : " + productList.get(i).getpName() + " | 가격 : " + productList.get(i).getPrice() + " | 재고 : " + productList.get(i).getAmount());
                        System.out.println("제품명 : " + productList.get(i).getpName() + " | 가격 : " + productList.get(i).getPrice() + " | 재고 : " + productList.get(i).getAmount());
                    }

                    /*System.out.println("주문할 제품의 번호를 알려주세요.");
                    int num = scr.nextInt();*/
                    System.out.println("-----------------------");
                    System.out.println("주문할 제품을 선택해 주세요.");
                    String pName = scr.nextLine();
                    System.out.println("주문할 수량을 입력해주세요.");
                    int amount = scr.nextInt();
                    // Product product = productList.get(number - 1);

                    int number = 0;

                    for (int i = 0; i < productList.size(); i++) {

                        if(productList.get(i).getpName().equals(pName)) {
                            number = i;
                            //System.out.println(number);
                        }

                    }

                    Product product = productList.get(number);


                    int pAmount = customer.addOrder(product, amount);

                    if(amount != pAmount){
                        product.setAmount(pAmount);
                    }


                    break;
                case 3 :
                    customer.viewOrder();

                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default :
                    System.out.println("잘못된 값을 입력하셨습니다.");
                    continue;
            }
        }






    }
}
