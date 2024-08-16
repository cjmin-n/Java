package main.java.com.ohgiraffers.understand2.service;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;
import main.java.com.ohgiraffers.understand2.dto.MemberDTO;


public class MemberService {

    /*public static MemberDTO[] memberDTOS = {new MemberDTO("id", "pwd"), new MemberDTO("jmin", "min")};*/


 /*   MemberDTO memberDTO = new MemberDTO("id", "pwd");
    MemberDTO memberDTO1 = new MemberDTO("id2", "pwd2");*/

    /*memberDTOS[0] = new MemberDTO("id", "pwd");*/

    private static MemberDTO[] memberDTOS = {
            new MemberDTO("id", "pwd"),
            new MemberDTO("id2", "pwd2"),
            new MemberDTO("jmin", "min")
    };



    public static boolean findMember(SnsAuth snsAuth, MemberDTO memberDTO) {

        for(MemberDTO defaultMember : MemberService.memberDTOS) {

            if(memberDTO.getId().equals(defaultMember.getId())){
                if(memberDTO.getPwd().equals(defaultMember.getPwd())){
                    System.out.println(snsAuth.login() + "에 인증된 " + memberDTO.getId() + "회원님 환영합니다.");
                    return true;
                }
            }
            /*if(memberDTO.getId().equals(defaultMember.getId()) && memberDTO.getPwd().equals(defaultMember.getPwd())){
                System.out.println(snsAuth.login() + "에 인증된 " + memberDTO.getId() + "회원님 환영합니다.");
                return true;
            }
            else {
                System.out.println(snsAuth.login() + "인증된 회원이 없습니다.");
               // break;
            }*/


            // System.out.println(defaultMember + " "+ memberDTOS + " " + memberDTO);
        }


        System.out.println(snsAuth.login() + "인증된 회원이 없습니다.");
        return false;
    }
}
