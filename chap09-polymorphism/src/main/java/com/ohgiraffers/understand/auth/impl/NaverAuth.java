package main.java.com.ohgiraffers.understand1.auth.impl;

import main.java.com.ohgiraffers.understand1.auth.SnsAuth;
import main.java.com.ohgiraffers.understand1.dto.MemberDTO;
import main.java.com.ohgiraffers.understand1.service.MemberService;

public class NaverAuth implements SnsAuth {

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
        System.out.println("네이버에 인증된 회원이 없습니다.");
        return false;
    }


}
