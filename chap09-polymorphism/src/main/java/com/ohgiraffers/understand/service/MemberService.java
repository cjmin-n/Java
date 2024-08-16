package main.java.com.ohgiraffers.understand.service;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;


public class MemberService {

//    public static MemberDTO[] memberDTOS = {new MemberDTO("id", "pwd"), new MemberDTO("id2", "pwd2")};
    public static MemberDTO[] memberDTOS = new MemberDTO[10];
    private static SnsAuth snsAuth;
    private static int count;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }


    public static boolean findMember(MemberDTO member){

        return snsAuth.login(member);

    }

    public static boolean addMember(MemberDTO member){

        if(count > 10){
            System.out.println("가입 가능한 인원을 초과했습니다.");
            return false;
        }else {
            memberDTOS[count++] = member;
            return true;
        }

    }

}
