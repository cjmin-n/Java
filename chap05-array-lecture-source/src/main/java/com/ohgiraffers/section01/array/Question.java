package main.java.com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Question {

    public static void main(String[] args) {

        // 트럼프 카드를 랜덤으로 한장 출력해보자.

        String[] shape = {"다이아", "하트", "스페이드", "클로버"};
        // int[] num = new int[10];
        String[] num = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        /*for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }*/

        int random = (int)(Math.random()*3)+1;
        //int random2 = (int)(Math.random()*9)+1;
        int random2 = (int)(Math.random()*12)+1;
        System.out.println("트럼프 카드 랜덤 한장 출력 : " + shape[random] + " " + num[random2]);

        int[] num1 = new int[10];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = i + 1;
        }
        String[] num2 = {"A", "J", "Q", "K"};
        int totalLength = num1.length + num2.length;
        for (int j = 0; j < totalLength; j++) {

        }


        /*
         *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고, -> 먼저 길이를 받고 if 문 으로 배열 길이 1이하 조건 넣기/ 길이만큼 숫자받는거 반복
         *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. (잘하면 두번째로 큰 값도) - > 만들어진 배열의 값중에 큰 값 비교 -> 최대값 ?
         *  만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없습니다." 출력
         * */
        Scanner scr = new Scanner(System.in);
        int arrLength = 0;

        int arrNum = 0;
        while(true){
            System.out.println("배열의 길이를 입력 해주세요 : ");
            arrLength = scr.nextInt();

            if (arrLength <= 1){
                System.out.println("1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없습니다.");
                continue;
            } else {
                break;
            }
        }

        int max = 0;
        int maxSecond = 0;
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("배열의 요소를 입력 해 주세요 : ");
            arrNum = scr.nextInt();
            arr[i] = arrNum;
            max = Math.max(max, arrNum);

            /*if(max > maxSecond && maxSecond > arrNum){
                maxSecond = max;
            }*/
            /*if (max > maxSecond){
                maxSecond = Math.max(maxSecond, arrNum);
            }*/

        }


        System.out.println("만들어진 값 중에 최고 값 : " + max);
        System.out.println("만들어진 값 중에 두번째 최고 값 : " + maxSecond);


        System.out.println(Arrays.toString(arr));








    }
}
