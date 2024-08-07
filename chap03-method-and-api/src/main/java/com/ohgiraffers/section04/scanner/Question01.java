package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        /*
        * 계산기 만들기
        * 계산기에 필요한 기능은 +, -, *, /, % 총 5가지 연산자다.
         * ((예시))
        * 첫 번째 숫자를 입력하세요.
        * 2
        * 연산할 기호를 쓰세요.
        * +
        * 두번째 숫자를 입력하세요.
        * 2
        * 결과는 4입니다.
        * */
        Scanner scr = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = scr.nextInt();

        scr.nextLine();
        System.out.println("연산할 기호를 쓰세요.");
        char b = scr.nextLine().charAt(0);
        if (!(b == '+' || b == '-' || b == '*' || b == '/' || b == '%')) {
            System.out.println("+, -, *, /, %만 입력해주세요.");
            b = scr.nextLine().charAt(0);
        }

        System.out.println("두번째 숫자를 입력하세요.");
        int c = scr.nextInt();

        if (b == '+') {
            System.out.println("결과는 " + (a + c) + "이다.");
        } else if (b == '-'){
            System.out.println("결과는 " + (a - c) + "이다.");
        } else if (b == '*') {
            System.out.println("결과는 " + (a * c) + "이다.");
        } else if (b == '/') {
            System.out.println("결과는 " + (a / c) + "이다.");
        } else if (b == '%') {
            System.out.println("결과는 " + (a % c) + "이다.");
        }

    }

}
