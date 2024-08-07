package main.java.com.ohgiraffers.section04.scanner;

import java.util.Random;

public class Question {

        /*
        * -100 ~ 100 사이의 난수를 발생 시켜서 인자로 전달하면
        * 매개변수가 양수면서 짝수면 X는 양수면서 짝수입니다. 양수면서 홀수면 X는 양수면서 홀수입니다.
        *           음수면서 짝수면 X는 음수면서 짝수입니다. 음수면서 홀수면 X는 음수면서 홀수입니다.
        * 를 반환하는 메소드를 다른 클래스에 생성해 메인 메소드에서 호출한 후 화면에 출력해보자
        * ( static / non-static 한번씩 )
        * */

    public static void main(String[] args) {

        // 1. 1~100 난수 구하기
        //java.lang.Math() 함수 활용
        int randomArg = (int)((Math.random() * 201)-100);

        // java.util.Random() 함수 활용
        Random rand = new Random();
        int randomArg2 = rand.nextInt(201)-100;

        System.out.println("randomArg = " + randomArg);
        System.out.println("randomArg2 = " + randomArg2);
        System.out.println("---------------------------");

        // 2. 다른 클래스에서 가져오기
        // non-static 클래스 가져오기
        RandomMethod random = new RandomMethod();
        random.randomM(randomArg);

        // static 클래스 가져오기
        RandomMethod.randomM2(randomArg2);

    }


}
