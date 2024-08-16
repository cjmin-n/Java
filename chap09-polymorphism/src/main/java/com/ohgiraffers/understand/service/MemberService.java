package main.java.com.ohgiraffers.understand1.service;

import main.java.com.ohgiraffers.understand1.auth.SnsAuth;
import main.java.com.ohgiraffers.understand1.dto.MemberDTO;


public class MemberService {

    public static MemberDTO[] memberDTOS = {new MemberDTO("id", "pwd"), new MemberDTO("id2", "pwd2")};
    private static SnsAuth snsAuth;

    public MemberService(SnsAuth snsAuth) {
        this.snsAuth = snsAuth;
    }


    public static boolean findMember(MemberDTO member){
        return snsAuth.login(member);
    }

}
