package main.java.com.ohgiraffers.understand.chap03;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int choice;
        String name;
        String id;
        Customer customer = new Customer();
        Product product = new Product();
         /* ArrayList<Product> products = new ArrayList<>();*/

        while(true){
            System.out.println("=== 온라인 상점을 위한 주문 관리 시스템 ===");
            System.out.println("번호를 선택해주세요.");
            System.out.println("1. 비회원");
            System.out.println("2. 회원");
            choice = scr.nextInt();

            if(choice == 1){
                System.out.println("주문을 위해서는 회원가입이 필요합니다.");
                System.out.println("회원가입을 진행하시겠습니까?");
                System.out.println("1. 네");
                System.out.println("2. 아니오");
                choice = scr.nextInt();
                scr.nextLine();

                if(choice == 1){
                    System.out.println("이름을 입력해주세요.");
                    name = scr.nextLine();
                    System.out.println("아이디를 입력해주세요.");
                    id = scr.nextLine();

                    // Customer 클래스로 name, id 보내주기.
                    customer.setcName(name);
                    customer.setId(id);

                }else {
                    System.out.println("프로그램을 종료합니다 !");
                    return;
                }


            }else if(choice == 2){
                while(true){
                    System.out.println("실행할 번호를 선택해주세요.");
                    System.out.println("1. 제품 목록 조회");
                    System.out.println("2. 제품 주문하기");
                    System.out.println("3. 주문 내역 조회");
                    System.out.println("9. 프로그램 종료");
                    choice = scr.nextInt();
                    scr.nextLine();

                    switch(choice){
                        case 1 :
                            product.list();
                            break;
                        case 2 :
                            product.list();
                            System.out.println("주문할 제품을 입력해주세요.");
                            String pName = scr.nextLine();
                            System.out.println("주문할 수량을 입력해주세요.");
                            int pAmount = scr.nextInt();
                            int price = 0;

                            for(Product p : product.products){
                                if(p.getpName().equals(pName)){
                                    price = p.getPrice();
                                }
                            }

                            product = new Product(pName, price, pAmount);

                            customer.addOrder(product);

                            break;
                        case 3 :
                            /* Customer.viewOrder() */;
                            // 주문된 것들끼리의 ????
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

    }
}
