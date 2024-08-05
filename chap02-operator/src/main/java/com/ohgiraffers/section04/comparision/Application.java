package main.java.com.ohgiraffers.section04.comparision;

public class Application {
    public static void main (String[] args) {
        /*
        * 비교 연산자
        * 비교 연산자는 피 연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항 연산자의 조건식이나 조건문의 조건절에 많이 사용한다.
        *
        * ==
        * !=
        * >
        * >=
        * <
        * <=
        *
        * */

        System.out.println(!true);
        System.out.println(!false);

        // 정수 자료형 비교
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("------- 정수 값 비교 --------");
        System.out.println("inum1 과 inum2 가 같은지 비교 : " + (inum1 == inum2)); // false 우선순위 때문에 괄호를 씌워서 비교를 먼저 한다.
        System.out.println("inum1 과 inum2 가 같지 않은지 비교 : " + (inum1 != inum2)); // true

        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2)); // false
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2)); // false
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2)); // true
        System.out.println("inum1이 inum2보다 작거나 같은지 비교 : " + (inum1 <= inum2)); // true
        
        // 실수 자료형 비교
        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("----------- 실수 값 비교 -----------");
        System.out.println("dnum1 과 dnum2 가 같은지 비교 : " + (dnum1 == dnum2)); // false
        System.out.println("dnum1 과 dnum2 가 같지 않은지 비교 : " + (dnum1 != dnum2)); // true

        System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2)); // false
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2)); // false
        System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2)); // true
        System.out.println("dnum1이 dnum2보다 작은거나 같은지 비교 : " + (dnum1 <= dnum2)); // true
        
        // 문자 값 비교
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("--------- 문자 값 비교 ---------");
        System.out.println("ch1 과 ch2 가 같은지 비교 : " + (ch1 == ch2)); // false - 대응되는 아스키코드가 다름
        System.out.println("ch1 과 ch2 가 같지 않은지 비교 : " +  (ch1 != ch2)); // true
        System.out.println("ch1이 ch2 보다 큰지 비교 : " + (ch1 > ch2)); // true - 97 > 65
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2)); // true
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2)); // false
        System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + (ch1 <= ch2)); // false

        // 논리 값 비교
        // ==, != 비교 가능하지만 대소비교는 불가능하다.

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("--------- 논리 값 비교 ---------");
        System.out.println("bool1 과 bool2 가 같은지 비교 : " + (bool1 == bool2)); // false
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2)); // true
        //System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2)); 에러
        //System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2)); 에러
        //System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2)); 에러
        //System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2)); 에러

        // 문자열값 비교
        // 문자열도 ==, != 비교 가능하지만, 대소 비교는 불가능하다.

        String str1 = "java"; // 값이 저장되어있는 램메모리 공간의 주소값을 가지고 있다. 그래서 대소 비교가 불가능하다.
        String str2 = "java";

        System.out.println("--------- 문자 값 비교 ---------");
        System.out.println("str1 과 str2 가 같은지 비교 : " + (str1 == str2)); // true
        System.out.println("str1 과 str2 가 같지 않은지 비교 : " + (str1 != str2)); // false
        //System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2)); 에러
        //System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2)); 에러
        //System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2)); 에러
        //System.out.println("str1이 str2보다 작은거나 같은지 비교 : " + (str1 <= str2)); 에러
        
        // 비교 연산자를 통해 직접 자료형에 값을 담는 것도 가능하다.
        int x = 10;
        int y = 11;
        boolean result = x <= y;
        System.out.println("result = " + result); // true
    }
}
