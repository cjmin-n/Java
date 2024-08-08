package main.java.com.ohgiraffers.section03.branching.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        
        /*
        * 자판기를 만들어보자.
        * 자판기가 파는 음료는 사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)
        * 잘못된 음료수가 선택되면 다시 받아야 한다.
        * 
        * 음료수를 선택하면 계산 여부를 물어본 후
        * 계산을 고르면 총 금액과 고른 음료수를 출력 해 주어야 한다.
        * 
        * 예시 ) 
        * 음료를 선택 해주세요 :
        * 사이다
        * 사이다를 선택하셨습니다.
        * 계산 하시겠습니까?
        * 네                         아니오
        * 총 상품은 사이다             음료를 더 선택 해주세요.
        * 총 금액은 500원 입니다.       콜라
        *                           콜라를 선택 하셨습니다.
        *                           계산 하시겠습니까?
        *                           네
        * */                          
        
        Scanner scr = new Scanner(System.in);
        System.out.println("음료를 선택 해주세요 : ");
        String drink = "";
        drink = scr.nextLine();

        String answer = "";

        String totalDrink = "";
        int totalCoast = 0;

        int coast = 0;

        while(true){

            switch (drink) {
                case "사이다":
                    coast = 500;
                    totalDrink += "사이다 ";
                    break;
                case "콜라":
                    coast = 600;
                    totalDrink += "콜라 ";
                    break;
                case "환타":
                    coast = 700;
                    totalDrink += "환타 ";
                    break;
                case "박카스":
                    coast = 1000;
                    totalDrink += "박카스 ";
                    break;
                case "핫식스":
                    coast = 1500;
                    totalDrink += "핫식스 ";
                    break;
                default :
                    System.out.println("음료를 다시 입력해주세요.");
                    drink = scr.nextLine();
                    break;
            }

            System.out.println(drink + "를 선택하셨습니다. \n계산하시겠습니까?");
            answer = scr.nextLine();
            totalCoast += coast;

            if (answer.equals("네")){

                break;

            } else if (answer.equals("아니오")){
                System.out.println("음료를 더 선택 해주세요.");
                drink = scr.nextLine();

                continue;
            }

        }

        System.out.println("총 상품은 " + totalDrink + "\n총 금액은 " + totalCoast + "원 입니다.");

        System.out.println("! 프로그램 종료 !");

    }


    /* TIP
    * 총 금액과 총 상품을 받을 변수 선언해놓기
    * 무한루프 반복문 만들기
    * 스캐너르르 이용해 원하는 음료를 입력 받기
    * 스위치를 이용해 해당 음료의 가격과 상품 명을 총 금액, 상품 변수에 추가하기 +=
    * 계산여부 물어보기
    * 계산할거면 break 를 이용해 무한루프를 끊어주며 총 금액, 총 상품 출력
    * 안할거면 음료를 더 선택해주세요 출력 후
    * 반복문 다시 반복
    * */
    
}
