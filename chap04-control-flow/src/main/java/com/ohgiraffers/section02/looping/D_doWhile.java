package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_doWhile {

    public void testSimpleDoWhileStatement(){

        /*
        * [do while 표현식]
        *
        * 초기식;
        * do {
        *   1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건식을 만족하는 경우에만 수행할 구문(반복할 구문);
        *   증감식;
        * } while(조건식);
        *
        * // 한번 보여주고 조건을 사용할 때 활용
        *
        * */

        do {
            System.out.println("최초 한 번 동작됨.");
        } while(false);
        System.out.println("반복문 종료 확인..");

    }

    public void testDoWhileExample(){

        /*
        * 키보드로 문자열을 입력 받아 반복적으로 출력한다.
        * 단, exit 가 입력 되면 반복문을 종료한다.
        * */

        Scanner scr = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("문자열을 입력해 주세요 : ");
            str = scr.nextLine();
            System.out.println(str);
        } while(!str.equals("exit"));

        System.out.println("프로그램을 종료합니다.");
    }


}
