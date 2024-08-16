package main.java.com.ohgiraffers.understand.auth.impl;

import main.java.com.ohgiraffers.understand.auth.SnsAuth;
import main.java.com.ohgiraffers.understand.dto.MemberDTO;
import main.java.com.ohgiraffers.understand.service.MemberService;


public class GoogleAuth implements SnsAuth {


    @Override
    public boolean login(MemberDTO member) {

        for(MemberDTO defaultMember : MemberService.memberDTOS){

            if(member.getId().equals(defaultMember.getId())){
                // System.out.println(member.getId() + " / " + defaultMember.getId());
                if(member.getPwd().equals(defaultMember.getPwd())){
                    // System.out.println(member.getPwd() + " / " + defaultMember.getPwd());
                    return true;
                }
            }
        }
        System.out.println("구글에 인증된 회원이 없습니다.");
        return false;
    }


}
