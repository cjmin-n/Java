package main.java.com.ohgiraffers.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator;

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf;
// import static 메소드까지 경로 입력

public class Application02 {
    public static void main(String[] args){

        /*
        * 임포트란?
        * 서로 다른 패키지에서 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        * import 는 package 선언문과 class 선언문 사이에 작성하며, 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
        * */

        Calculator calc = new Calculator(); // import 구문 작성법 : ctrl + spacebar

        // non-static 메소드 호출
        int min = calc.minNumberOf(50, 60);
        System.out.println(min); // 50

        // static 메소드 호출
        int max = maxNumberOf(100, 200); // import 구문 작성법 : 마우스 올려서 밑에 파란글 누르기 !
        // int max = Calculator.maxNumberOf(100, 200) : import static 안하고, import class 경로만 했을 경우
        System.out.println(max); // 200



    }
}
