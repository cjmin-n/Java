package main.java.com.ohgiraffers.section01.method;

public class Question {
    public static void main(String[] args){

        /*
        * 만들어보자
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 나눈 값을 반환하는 메소드
        * */

        Question quest = new Question();
        int plus = quest.plus(10, 20);
        System.out.println("두 수를 매개변수로 받아 더한 값을 반환하는 메소드의 값 : " + plus); // 30
        int minus = quest.minus(10, 20);
        System.out.println("두 수를 매개변수로 받아 뺀 값을 반환하는 메소드의 값 : " + minus); // -10
        int multiply = quest.multiply(10, 20);
        System.out.println("두 수를 매개변수로 받아 곱한 값을 반환하는 메소드의 값 : " + multiply); // 200
        int divide = quest.divide(10, 20);
        System.out.println("두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 나눈 값을 반환하는 메소드의 값 : " + divide); // 0 (내림)
    }

    public int plus(int a, int b){
        return a + b;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }
}
