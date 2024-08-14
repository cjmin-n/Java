package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        LoginService loginService = new LoginService();

        loop:while(true){
            System.out.println("----- 사용자 회원가입 및 로그인 시스템 ------");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("9. 프로그램 종료");
            int no = scr.nextInt();

            switch(no){
                case 1 : loginService.signUp(); break;
                case 2 :
                    if(loginService.login()){
                        break loop;
                    }; break;
                case 9 :
                    System.out.println("프로그램 종료"); break loop;
                default :
                    System.out.println("잘못입력하셨습니다."); break;
            }

        }


    }
}
