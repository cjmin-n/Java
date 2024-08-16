package main.java.com.ohgiraffers.Understand.service;

import main.java.com.ohgiraffers.Understand.auth.SnsAuth;
import main.java.com.ohgiraffers.Understand.dto.MemberDTO;

public class MemberService {


    /*private static MemberDTO[] member = new MemberDTO[2];*/
    public static MemberDTO[] memberDTOS = new MemberDTO[]{new MemberDTO("id1", "pwd2"), new MemberDTO("id2", "pwd2"),};
    private static int count;



    public static void login(SnsAuth snsAuth, MemberDTO newMember){

        // member[count] = newMember;
        count++;

        if(!memberDTOS[count].getId().equals(newMember.getId()) || !memberDTOS[count].getPwd().equals(newMember.getPwd())){

            System.out.println(newMember + " " + memberDTOS[count].getId() + "     " + newMember.getId());
            System.out.println(snsAuth.login() + "인증된 회원이 없습니다.");
            /*return false;*/
        }else {
            System.out.println(snsAuth.login() + "인증된 " + newMember.getId() + "회원님 환영합니다.");
            /*return true;*/
        }
        
        
    }



}
