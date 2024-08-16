package main.java.com.ohgiraffers.understand1.auth;

import main.java.com.ohgiraffers.understand1.dto.MemberDTO;

public interface SnsAuth {

    boolean login(MemberDTO member);
}
