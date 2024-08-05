package main.java.com.ohgiraffers.section05.logical;

public class Application03 {
    public static void main(String[] args) {
        /*
        * 논리식 && : 앞의 결과가 false 이면 뒤의 연산을 실행하지 않음
        * 논리식 || : 앞의 결과가 true 이면 뒤의 연산을 실행하지 않음.
        *
        * */

        /*
        * &&
        * 조건식 두 개가 모두 만족해야 true 를 반환하지만 앞에서 false 가 나오게 되면 뒤의 조건을 확인할 필요 없이 false 를 반환한다.
        * 따라서 연산 횟수를 줄이기 위해서는 && 연산의 경우 false 가 나올 확률이 높은 조건을 앞에 작성하는 것이 좋다.
        * */

        int num1 = 10;
        int result = (false && ++num1 > 0) ? num1 : 20;
        System.out.println("result = " + result); // 20 - false
        System.out.println(num1); // 10 - 앞 구문이 false 이기 때문에 아예 실행되지않음

        /*
        * ||
        * 조건식 둘 중 하나라도 true 를 반환하면 true 를 반환하기 때문에 앞에서 미리 true 가 나오게 되면 뒤의 조건을 확인할 필요 없이 true 를 반환한다.
        *
        * */

        int num2 = 20;
        int result2 = (true || ++num2 > 0) ? num2 : 30;
        System.out.println("result2 = " + result2); // 20
        System.out.println(num2); // 20

    }
}
