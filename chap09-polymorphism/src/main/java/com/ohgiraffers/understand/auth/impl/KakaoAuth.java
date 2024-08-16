package main.java.com.ohgiraffers.Understand.auth.impl;

import main.java.com.ohgiraffers.Understand.auth.SnsAuth;
import main.java.com.ohgiraffers.Understand.service.MemberService;

public class KakaoAuth implements SnsAuth {
    @Override
    public String login() {
        return "카카오";
    }


}
