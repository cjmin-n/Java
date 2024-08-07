package main.java.com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
        // a.testSimpleIfStatement();
        // a.testNestedIfStatement();

        B_ifElse b = new B_ifElse();
        // b.testSimpleIfElseStatement();
        // b.testNestedIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
        // c.testSimpleIfElseIfStatement();
        // c.testNestedIfElseIfStatement();

        /*String name2 ="홍길동";
        int point2 = 60;
        c.gradeCalculator(name2, point2);*/

        /*Scanner scr = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        String name = scr.nextLine();
        System.out.println("점수를 입력해주세요");
        int point = scr.nextInt();
        c.gradeCalculator(name, point);*/

        D_switch d = new D_switch();
        // d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();

    }
}
