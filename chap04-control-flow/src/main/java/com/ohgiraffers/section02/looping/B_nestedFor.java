package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine(){

        // for 문 안에서 for 문을 이용할 수 있다.

        // 2~9단까지 쭉 출력
        for (int dan = 2; dan < 10; dan++) { // fori tab

            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println();
        }

    }

    public void printUpgradeGugudan(){

        // 단을 2부터 9까지 증가시킨다.
        for (int dan = 2; dan < 10; dan++) {

            printGugudan(dan);

            System.out.println();
        }

    }

    public void printGugudan(int dan){

        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }

    }


    public void printStars(){


        /*
        * 키보드로 정수를 입력 받아 해당 정수 만큼 한 행에 "*" 을 행의 번호개씩 출력 해주세요.
        *
        * 예시 ) 정수를 입력하세요 : 5
        *
        * *
        * **
        * ***
        * ****
        * *****
        *
        * */

        Scanner scr = new Scanner(System.in);
        System.out.println("숫자를 입력해 주세요.");
        int row = scr.nextInt();

        // 1부터 입력 수 까지
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();

        }

        // 입력 수부터 1까지 역순
        for (int i = row; i >= 1; i--){
            
            for (int j = 1; j <= i; j++) { // 선생님 답
            //for (int j = i; j >= 1; j--){ // 내 답
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
