package main.java.com.ohgiraffers.Understand;

import main.java.com.ohgiraffers.Understand.auth.SnsAuth;
import main.java.com.ohgiraffers.Understand.auth.impl.GoogleAuth;
import main.java.com.ohgiraffers.Understand.auth.impl.KakaoAuth;
import main.java.com.ohgiraffers.Understand.auth.impl.NaverAuth;
import main.java.com.ohgiraffers.Understand.dto.MemberDTO;
import main.java.com.ohgiraffers.Understand.service.MemberService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String id;
        String pwd;

//        Application app = new Application();
        SnsAuth snsAuth1 = new GoogleAuth();
        SnsAuth snsAuth2 = new KakaoAuth();
        SnsAuth snsAuth3 = new NaverAuth();

        String auth = null;

        loop:while(true){
            System.out.println("=== 로그인 ===");
            System.out.println("로그인 방식을 선택해주세요.");
            System.out.println("1. google");
            System.out.println("2. kakao");
            System.out.println("3. naver");
            System.out.println("9. 프로그램 종료");

            int no = scr.nextInt();
           /* if (no == 9){
                System.out.println("프로그램 종료 !!");
                break loop;
            }*/
            switch (no) {
                case 1: break;
                case 2: break;
                case 3: break;
                case 9: System.out.println("프로그램 종료 !!"); break loop;
                default:
                    System.out.println("다시 입력해주세요."); continue;
            }

            System.out.println("아이디를 입력해주세요.");

            id = scr.nextLine();
            scr.nextLine();
            System.out.println("비밀번호를 입력해주세요.");
            pwd = scr.nextLine();

            MemberDTO member = new MemberDTO(id, pwd);

            switch (no) {

                case 1:
                    /*auth = MemberService.auth(snsAuth1);*/
                    MemberService.login(snsAuth1, member);
                    break;
                case 2:
                    MemberService.login(snsAuth2, member);
                    break;
                case 3:
                    MemberService.login(snsAuth3, member);
                    break;
                default:
                    System.out.println("다시 입력해주세요."); continue;
            }

        }





    }

    /*public String auth(SnsAuth snsAuth){
        return snsAuth.login();
    }*/
}
