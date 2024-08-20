package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
         * 사용자에게 숫자 두 개와 연산자를 입력 받습니다.
         * 입력된 연산을 수행하여 결과를 출력합니다.
         * / 는 0으로 할 수 없기 때문에 예외처리 해주시고
         * 사용자가 잘못된 연산자를 입력하면 예외처리 해주세요.
         * */

        int result = 0;

        Scanner scr = new Scanner(System.in);
        System.out.println("=== 연산 시스템 ====");
        System.out.println("첫번째 숫자를 입력해주세요.");
        int no = scr.nextInt();
        System.out.println("두번째 숫자를 입력해주세요.");
        int no2 = scr.nextInt();
        System.out.println("연산자를 입력해주세요. + - / * ");
        char op = scr.next().charAt(0);

        try{
            switch (op) {
                case '+' : result = no + no2; break;
                case '-' : result = no - no2; break;
                case '*' : result = no * no2; break;
                case '/' :
                    if(no == 0 || no2 == 0){
                        throw new Exception("숫자 0 나눗셈 불가 오류");
                    }else {
                        result = no / no2;
                    }
                    break;
                default:
                    throw new Exception("연산자 입력 오류");
            }
            System.out.println("연산 결과는 " + result + "입니다.");
        } catch(Exception e){
            /*System.out.println("!! 오류발생 !!");
            e.printStackTrace();*/
            System.out.println("오류발생 : " + e.getMessage());
        };


        System.out.println("프로그램 종료");

    }

}
