package main.java.com.ohgiraffers.section02.assignment;

public class Application {
    public static void main(String[] args) {

        /*
        * 대입 연산자와 산술 복합 대입 연산자
        *
        * '=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 대입한다.
        * '+=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 더한 결과를 대입한다.
        * '-=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 뺀 값을 대입한다.
        * '*=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 곱한 값을 대입한다.
        * '/=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 나눈 값을 대입한다.
        * '%=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 나눈 나머지 결과를 대입한다.
        * */

        int num = 12;
        System.out.println("num = " + num); // soutv
        
        // 3 증가
        num = num + 3;
        System.out.println("num = " + num);

        num += 3;
        System.out.println("num = " + num);
        
        // 5로 나눈 나머지 값
        num %= 5;
        System.out.println("num = " + num);

        num = 12;
        //num = num * 4.1; 에러. 값이 실수로 나오기 때문에.
        num *= 4.1; // 복합대입연산자를 사용하면 형변환도 해준다.
        System.out.println("num = " + num);
        
    }
}
