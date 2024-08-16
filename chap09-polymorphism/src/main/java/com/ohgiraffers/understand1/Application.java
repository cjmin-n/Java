package main.java.com.ohgiraffers.understand1;

import main.java.com.ohgiraffers.understand1.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.understand1.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.understand1.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.understand1.dto.MemberDTO;
import main.java.com.ohgiraffers.understand1.service.MemberService;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        MemberService memberService;

        String id;
        String pwd;
        boolean result;

        while(true){
            System.out.println("==== 시작 ====");
            System.out.println("인증방식을 선택해주세요.");
            System.out.println("1. 구글 인증");
            System.out.println("2. 네이버 인증");
            System.out.println("3. 카카오 인증");
            System.out.println("9. 프로그램 종료");

            int choice = scr.nextInt();
            scr.nextLine();

            System.out.println("아이디를 입력해주세요.");
            id = scr.nextLine();


            System.out.println("비밃번호를 입력해주세요");
            pwd = scr.nextLine();

            MemberDTO memberDTO = new MemberDTO(id, pwd);


            switch (choice) {
                case 1:
                    memberService = new MemberService(new GoogleAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("goole로그인에 성공하였습니다. " + memberDTO.getId());
                        return;
                    }
                    break;
                case 2:
                    memberService = new MemberService(new NaverAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("naver로그인에 성공하였습니다. " + memberDTO.getId());
                        return;
                    }
                    break;
                case 3:
                    memberService = new MemberService(new KakaoAuth());
                    result = memberService.findMember(memberDTO);
                    if (result) {
                        System.out.println("kakao 로그인에 성공하였습니다.. " + memberDTO.getId());
                        return;
                    }
                    break;
                case 9:
                    System.out.println("로그인을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 다시 입력해주세요."); continue;

            }


        }







    }
}
