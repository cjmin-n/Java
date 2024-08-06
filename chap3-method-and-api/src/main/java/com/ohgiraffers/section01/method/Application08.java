package main.java.com.ohgiraffers.section01.method;

public class Application08 {
    public static void main(String[] args) {

        /*
        * 다른 클래스에 작성한 메소드 호출
        *
        * */

        // non - static 메소드의 경우
        // 클래스가 다르더라도 사용하는 방법은 동일하다.
        Calculator calc = new Calculator();
        int first = 100;
        int second = 50;
        int min = calc.minNumberOf(first, second);
        System.out.println(min); // 50

        // static 메소드의 경우
        // 다른 클래스에 작성한 static 메소드의 경우 호출할 때 반드시 클래스명을 기술해야 한다.
        int max = Calculator.maxNumberOf(first, second);
        System.out.println(max); // 100

    }
}
