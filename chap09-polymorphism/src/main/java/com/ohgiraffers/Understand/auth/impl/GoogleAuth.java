package main.java.com.ohgiraffers.Understand.auth.impl;

import main.java.com.ohgiraffers.Understand.auth.SnsAuth;

public class GoogleAuth implements SnsAuth {
    @Override
    public String login() {
        return "구글";
    }
}
