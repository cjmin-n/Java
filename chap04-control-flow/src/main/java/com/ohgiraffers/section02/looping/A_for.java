package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){

        /*
        * [for 표현식]
        * for (초기식; 조건식; 증감식){
        *   조건을 만족하는 경우 수행할 구문(반복할 구문);
        * }
        * */

        // 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        /* 무한루프
        for (;;){

        }*/

    }

    public void testForExample() {

        // 1~10까지의 합계를 구하시오
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;
        int num7 = 7;
        int num8 = 8;
        int num9 = 9;
        int num10 = 10;

        // 더한 값을 넣어줄 변수
        int sum = 0;

        // sum 변수에 값 하나씩 담기
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        sum += num6;
        sum += num7;
        sum += num8;
        sum += num9;
        sum += num10;

        System.out.println("sum = " + sum);

        /*
        * 무엇을 반복해야 할까?
        *
        * 반복해야 할 내용
        * 1. 변수에 1씩 증가하는 값을 담기
        * 2. 저장된 값을 sum 에 누적시키기
        * 반복 횟수는 ? 1부터 10까지 증가 (10번)
        *
        * 반복하지 않을 내용
        * 1. sum 초기화
        * 2. sum 출력
        *
        * */

        int sum2 = 0;

        for (int i = 1; i <= 10; i++){
            sum2 += i;
        }
        System.out.println("sum2 = " + sum2);
    }


    public void printGugudan (){

        // 키보드로 2~9 사이의 구구단을 입력 받아
        // 2~9 사이인 경우 해당 단의 구구단을 출력한다.
        // 그렇지 않은 경우 "반드시 2~9 사이의 양수를 입력해야 합니다" 출력

        Scanner scr = new Scanner(System.in);
        System.out.println("단수를 입력해 주세요 : ");
        int dan = scr.nextInt();

        if (dan >= 2 && dan <= 9) {
            /*System.out.println(dan + " * " + 1 + " = " + (dan*1));
            System.out.println(dan + " * " + 2 + " = " + (dan*2));
            System.out.println(dan + " * " + 3 + " = " + (dan*3));
            System.out.println(dan + " * " + 4 + " = " + (dan*4));
            System.out.println(dan + " * " + 5 + " = " + (dan*5));
            System.out.println(dan + " * " + 6 + " = " + (dan*6));
            System.out.println(dan + " * " + 7 + " = " + (dan*7));
            System.out.println(dan + " * " + 8 + " = " + (dan*8));
            System.out.println(dan + " * " + 9 + " = " + (dan*9));*/

            for (int i = 1; i < 10; i++){
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        } else {
            System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
        }

    }

    public void testForExample2 (){

        // 숫자 두 개를 입력 받아 작은 수에서 큰 수까지의 합계를 구해주세요.
        // 단, 같은 숫자를 입력하지 않는 다는 가정
        Scanner scr = new Scanner(System.in);
        /*System.out.println("숫자를 입력해주세요.");
        int a = scr.nextInt();
        System.out.println("입력하신 숫자보다 큰 수를 입력해 주세요.");
        int b = scr.nextInt();

        int result = 0;
        for (int i = a; i <= b; i++){
            result += i;
        }
        System.out.println(result);*/

        System.out.println("첫번째 숫자를 입력해 주세요.");
        int a = scr.nextInt();
        System.out.println("두번째 숫자를 입력해 주세요.");
        int b = scr.nextInt();

        int min = 0;
        int max = 0;

        if (a < b) {
            min = a;
            max = b;
        }else if (a > b) {
            max = a;
            min = b;
        }
        int result = 0;
        for (int i = min; i <= max; i++){
            result += i;
        }

        System.out.println("작은 수 " + min + "부터 큰 수 " + max + " 까지의 합은 " + result + " 입니다.");


    }

    public void test() {
        /*
         * 주어진 숫자 범위 내에서 소수를 찾아 출력하는 프로그램을 작성해 봅시다.
         * 사용자로부터 시작 숫자와 끝 숫자를 입력받습니다.
         * 프로그램은 해당 범위 내에 모든 소수를 찾아서 출력합니다.
         * 소수 : 1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수
         *
         * break : 해당 제어문 탈출.
         * for 문 안에서 break; 를 만나면 해당 순서 넘기고 다음 반복으로
         * */
        Scanner scr = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해 주세요.");
        int a = scr.nextInt();

        System.out.println("두번째 숫자를 입력해 주세요.");
        int b = scr.nextInt();


        int min = 0;
        int max = 0;

        if (a < b) {
            min = a;
            max = b;
        }else if (a > b) {
            max = a;
            min = b;
        }

        System.out.println(min + " 부터 " + max + "까지의 소수");

        for (int i = min; i <= max; i++){

            boolean isTrue = true;

            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    isTrue = false;
                    break;
                }
            }
            if (isTrue == true) {
                if(i == 0 || i == 1){
                    isTrue = false;
                } else {
                    System.out.println(i);
                }
            }

        }

    }

    // 틀린 답
    public void wrong(){

        // 값 임의 설정
        int min = 10;
        int max = 12;

        for (int i = min; i <= max; i++){

            for (int j = 2; j < i; j++){
                if(i % j != 0){
                    // 소수이다.
                    System.out.println(i);
                }
            }
        }
    }

}
