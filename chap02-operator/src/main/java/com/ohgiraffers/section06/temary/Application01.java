package main.java.com.ohgiraffers.section06.temary;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 삼항 연산자
        * 자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        * 항목이 3개 : (조건식) ? 참일 때 사용 값 : 거짓일 때 사용 값
        * 조건식은 반드시 결과가 true 혹은 false 가 나오게 작성해야 함.
        * 비교 / 논리 연산자가 주로 사용됨.
        * */

        // 삼항연산자 단독 사용
        int num1 = 10;
        int num2 = -10;

        String result1 = (num1 > 0) ? "양수다." : "양수가 아니다.";
        String result2 = (num2 > 0) ? "양수다." : "양수가 아니다.";

        System.out.println("num1 은 " + result1); // 양수다.
        System.out.println("num2 는 " + result2); // 양수가 아니다.

        // 삼항연산자 중첩 사용
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0) ? "양수다." : (num3 == 0) ? "0이다." : "음수다.";
        String result4 = (num4 > 0) ? "양수다." : (num4 == 0) ? "0이다." : "음수다.";
        String result5 = (num5 > 0) ? "양수다." : (num5 == 0) ? "0이다." : "음수다.";

        System.out.println("num3 은 " + result3); // 양수다.
        System.out.println("num4 은 " + result4); // 0이다.
        System.out.println("num5 은 " + result5); // 음수다.

    }
}
