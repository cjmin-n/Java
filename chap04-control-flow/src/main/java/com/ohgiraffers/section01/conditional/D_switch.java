package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement(){

        /*
        * [switch 문 표현식]
        * switch(비교할 변수) {
        *   case 비교값1: 비교값 1과 일치하는 경우 실행할 구문; break;
        *   case 비교값2: 비교값 2과 일치하는 경우 실행할 구문; break;
        *   case 비교값3: 비교값 3과 일치하는 경우 실행할 구문; break;
        *   default : case 모두에 해당하지 않는 경우 실행할 구문; break;
        * }
        *
        * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행한다.
        * if-else-if 와 비슷하다. 따라서 일부 호환이 가능하다.
        * 하지만, switch 문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
        * 실수와 논리는 비교할 수 없다.
        * 또한 정확하게 일치하는 경우에만 비교할 수 있으며 대소비교를 할 수 없다.
        * case 절에는 변수를 사용하지 못한다.
        *
        * */

        // 계산기 만들기
        Scanner scr = new Scanner(System.in);
        System.out.println("첫번째 정수 입력 : ");
        int first = scr.nextInt();

        System.out.println("두번째 정수 입력 : ");
        int second = scr.nextInt();

        System.out.println("연산 기호 입력 : ");
        char op = scr.next().charAt(0);

        int result = 0;

        switch (op){
            case '+' : result = first + second; break;
            case '-' : result = first - second; break;
            case '*' : result = first * second; break;
            case '/' : result = first / second; break;
            case '%' : result = first % second; break;
        }

        System.out.println(first + " " + op + " " + second + " = " + result);

    }

    public void testSwitchVendingMachine(){

        // 자판기로 switch 를 이용해서 만들어 보자

        System.out.println("------------ vending machine ------------");
        System.out.println("사이다(500), 콜라(600), 환타(700), 박카스(1000)");
        System.out.println("-----------------------------------------");
        System.out.println("음료를 선택 해주세요 : ");

        Scanner scr = new Scanner(System.in);
        String selectedDrink = scr.nextLine();

        int price = 0;
        switch (selectedDrink){
            case "사이다" : price = 500; break;
            case "콜라" : price = 600; break;
            case "환타" : price = 700; break;
            case "박카스" : price = 1000; break;
            // default : price = 0; break;
        }

        System.out.println(selectedDrink + "를 선택 하셨습니다.");
        System.out.println(price + "원을 투입해주세요");



    }


}
