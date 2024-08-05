package main.java.com.ohgiraffers.section05.logical;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 논리 연산자
        * 논리값을 취급하는 연산자이다.
        *
        * 논리 연산자의 종류
        * 1. 논리 연결 연산자 : 두 개의 피 연산자를 가지는 이항 연산자이며, 연산자의 결함 방향은 왼쪽에서 오른쪽이다. 두 개의 논리식을 판단하여 참과 거짓을 판단한다.
        *   1-1. && (AND 논리) : 두 개의 논리식 모두 참일 경우 참을 반환, 한 개라도 거짓일 경우 거짓을 반환하는 연산자이다.
        *   1-2. || (OR 논리) : 두 개의 논리식 중 하나라도 참일 경우, 참을 반환, 둘 다 모두 거짓인 경우 거짓을 반환하는 연산자이다.
        * 2. 논리 부정 연산자 : 피 연산자가 하나인 단항 연산자
        *   2-1. ! (not 논리) : 논리식의 결과가 참이면 거짓, 거짓이면 참을 반환한다.
        *
        * */

        System.out.println("true 와 true 의 논리 and 연산 : " + (true && true)); // true
        System.out.println("true 와 false 의 논리 and 연산 : " + (true && false)); // false
        System.out.println("false 와 true 의 논리 and 연산 : " + (false && true)); // false - &&연산자는 앞에가 false인 확률이 큰 것을 먼저 쓴다.
        System.out.println("false 와 false 의 논리 and 연산 : " + (false && false)); // false

        System.out.println("true 와 true 의 논리 or 연산 : " + (true || true)); // true
        System.out.println("true 와 false 의 논리 or 연산 : " + (true || false)); // true
        System.out.println("false 와 false 의 논리 or 연산 : " + (false || false)); // false

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("-----------------------------------------");

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + ((a < b) && (c < d))); // true - 우선순위는 낮지만 서로 확인하기 편하게 하기 위해 비교연산자에 괄호를 씌운다.
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + ((a < b) && (c > d))); // false
        System.out.println("a가 b보다 크면서 c가 d보다 작은 확인 : " + ((a > b) && (c < d))); // false
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + ((a > b) && (c > d))); // false

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + ((a < b) || (c < d))); // true
        System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + ((a < b) || (c > d))); // true
        System.out.println("a가 b보다 크거나 c가 d보다 작은 확인 : " + ((a > b) || (c < d))); // true
        System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + ((a > b) || (c > d))); // false

    }

}
