package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement(){

        /*
        * [if문 표현식]
        * if(조건식){
        *   조건식이 true 일 때 실행할 명령문.
        * }
        *
        * 조건식 : true or false 가 나오는 연산식을 조건식 이라고 한다.
        * if문은 조건식의 결과 값이 참(true) 이면 {} 안에 있는 코드를 실행하고, 조건식의 결과 값이 거짓(false) 이면 {} 안에 코드를 무시하고 넘어간다.
        *
        * */

        // 정수 한 개를 입력 받아 그 수가 짝수이면
        // " 입력하신 숫자는 짝수입니다 " 를 출력해본다.
        // 단, 조건에 상관 없이 프로그램이 종료될 때
        // "프로그램을 종료합니다" 라고 출력되도록 한다.

        Scanner scr = new Scanner(System.in);
        System.out.println("정수를 입력해주세요 : ");
        int first = scr.nextInt();
        if (first % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public void testNestedIfStatement(){

        // 중첩된 if문 실행 흐름 확인

        // 정수 한 개를 입력 받아 양수인 경우에만 그 수가 짝수이면
        // " 입력하신 숫자는 짝수입니다 " 를 출력해본다.
        // 단, 조건에 상관 없이 프로그램이 종료될 때
        // "프로그램을 종료합니다" 라고 출력되도록 한다.

        Scanner scr = new Scanner(System.in);

        System.out.println("숫자를 입력해주세요 : ");
        int num = scr.nextInt();
        if (num > 0){
            if(num % 2 == 0) {
                System.out.println("입력하신 숫자는 양수면서 짝수");
            }
        }
        System.out.println("프로그램을 종료합니다.");

    }
}
