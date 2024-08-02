package main.java.com.ohgiraffers.section01.arithmetic;

public class Application {
    public static void main(String[] args) {

        /*
        * 산술 연산자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서 가장 많이 사용되는 연산자이다.
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두 개인 이항 연산자로 분류되며 피 연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        *
        * 산술 연산자의 종류
        * +
        * -
        * *
        * /
        * %
        *
        * 우선순위는 알고 있는 수학과 동일하다.
        * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + num1 + num2); // 207
        System.out.println("num1 + num2 = " + (num1 + num2)); // 27

        //System.out.println("num1 + num2 = " + num1 - num2); // 에러
        System.out.println("num1 + num2 = " + (num1 - num2)); // 13
        System.out.println("num1 * num2 = " + num1 * num2); // 140
        System.out.println("num1 / num2 = " + num1 / num2); // 2
        System.out.println("num1 % num2 = " + num1 % num2); // 6


    }
}
