package main.java.com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement(){

        /*
        * continue 문은 반복문 내에서 사용한다.
        * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다.
        * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 사용된다.
        * */

        // 구구단 2~9단 출력
        // 단, 단의 수가 짝수인 경우 제외

        for (int dan = 2; dan < 10; dan++) {

            for (int su = 1; su < 10; su++) {
                if (su % 2 == 0){
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();

        }

    }

}
