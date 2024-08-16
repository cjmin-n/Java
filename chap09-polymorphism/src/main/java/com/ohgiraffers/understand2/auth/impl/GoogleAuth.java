package main.java.com.ohgiraffers.understand2.auth.impl;

import main.java.com.ohgiraffers.understand2.auth.SnsAuth;

public class GoogleAuth implements SnsAuth {
    @Override
    public String login() {
        return "구글";
    }
}
