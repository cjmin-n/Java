package main.java.com.ohgiraffers.Understand.auth.impl;

import main.java.com.ohgiraffers.Understand.auth.SnsAuth;

public class NaverAuth implements SnsAuth {
    @Override
    public String login() {
        return "네이버";
    }
}
