package main.java.com.ohgiraffers.understand2;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;
import main.java.com.ohgiraffers.understand2.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand2.dto.MemberDTO;
import main.java.com.ohgiraffers.understand2.service.MemberService;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        MemberService memberService = new MemberService();
        loop:while(true){
            System.out.println("~~ 로그인 프로그램 ~~");
            System.out.println("로그인 인증방식을 선택해주세요.");
            System.out.println("1. 구글");
            System.out.println("2. 카카오");
            System.out.println("3. 네이버");
            System.out.println("9. 프로그램 종료");

            int no = scr.nextInt();
            scr.nextLine();

            System.out.println("아이디를 입력해주세요.");
            String id = scr.nextLine();
            System.out.println("비밀번호를 입력해주세요.");
            String pwd = scr.nextLine();

            MemberDTO memberDTO = new MemberDTO(id, pwd);
            SnsAuth google = new GoogleAuth();

            switch(no){
                case 1 : if(memberService.findMember(google, memberDTO)) break loop;
                case 9 :
                    System.out.println("프로그램을 종료합니다."); break loop;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다."); continue;
            }

        }

    }
}
