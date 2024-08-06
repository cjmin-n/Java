package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
        * java.util.scanner
        * 콘솔 화면에 값을 입력 받는 기능을 제공한다.
        * */

        Scanner scr = new Scanner(System.in); // System.in - 입력을 받기 위한 권한 부여

        System.out.println("이름을 입력 해주세요 : " );
        String name = scr.nextLine(); // 엔터를 만날때까지 모든 단어 - String 을 담음
        System.out.println("안녕하세요 " + name + "님!");

        // 정수
        System.out.println("나이를 입력 해주세요 : ");
        int age = scr.nextInt(); // nextInt() 입력되는 정수값을 담는 메소드  -> int 자료형에 맞는 입력값을 입력해줘야 한다.
        System.out.println("입력하신 나이가 " + age + "세가 맞으세요?");

        System.out.println("금액을 입력 해주세요 : ");
        long lnum = scr.nextLong(); // nextLong() 해당 자료형에 맞는 자료형만 입력해야 한다.
        System.out.println("입력하신 long : " + lnum);

        // 실수
        System.out.println("원하는 실수를 입력 해주세요 : ");
        double number = scr.nextDouble(); // 형변환 -> 정수 입력 시
        System.out.println("입력하신 실수는 " + number + " 입니다.");

        // 논리형
        System.out.println("true or false 입력");
        boolean isTrue = scr.nextBoolean();

        if(isTrue) {
            System.out.println("참이다.");
        } else {
            System.out.println("거짓이다.");
        }

        scr.nextLine(); // nextLine()을 또 사용하려면 빈 nextLine()으로 받아줘야 한다.

        // 문자형 값 입력
        System.out.println("아무 문자나 입력 해주세요 : ");
        char charValue = scr.nextLine().charAt(0); // nextChar() 는 없음
        System.out.println(charValue);


    }
}
