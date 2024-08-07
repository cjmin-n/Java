package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Arrays;
import java.util.Scanner;

public class Question {

    /*
    * a,b,c 세 과목의 점수를 스캐너로 입력 받고 세 과목의 점수를 메소드를 생성해 매개변수로 전달해 평균을 계산하고,
    * 평균과 점수를 이용하여 합격 / 불합격 처리하는 기능을 구현 해주세요.
    * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서, 평균이 60점을 넘어야 함.)
    * 합격했을 경우에는 평균 점수와 "합격입니다" 를 출력하고,
    * 불합격인 경우에는 "불합격입니다." 라고 출력 해주세요.
    * */
    public static void main(String[] args) {
        /*Scanner scr = new Scanner(System.in);
         System.out.println("a 과목의 점수를 입력해 주세요");
        int a = scr.nextInt();
         System.out.println("b 과목의 점수를 입력해 주세요");
        int b = scr.nextInt();
         System.out.println("c 과목의 점수를 입력해 주세요");
        int c = scr.nextInt();

        Question average = new Question();
        average.aver(a, b, c);*/


        /*
         * 피보나치 수열(An = An-1 + An-2)을 화면에 출력해라.
         * 1. 결과값 {1 1 2 3 5 8 13 21 34}
         * 2. for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
         * 3. 9개 까지 출력한다.
         * */

        int num = 9;
        int[] result = new int[num];

        for (int i = 0; i < num; i++){

            if (i == 0){
                result[i] = i + 1;
            } else if (i == 1){
                result[i] = i;
            } else {
                result[i] = result[i-1] + result[i-2];
            }

        }
        System.out.println(Arrays.toString(result));

    }


    public void aver(int a, int b, int c){
            int aver = (int)((a+b+c) / 3);
            // double aver = (double)((a+b+c) / 3)

            if (aver >= 60){
               if(a >= 40 && b >= 40 && c >= 40){
                   System.out.println("평균점수는 " + aver + "이고, 합격입니다.");
               }
            }else {
                System.out.println("불합격입니다.");
            }
    }




}
