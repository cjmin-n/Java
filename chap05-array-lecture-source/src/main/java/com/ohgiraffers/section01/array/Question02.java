package main.java.com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        /*  -- 심화
         * 배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만든 후,
         * 배열에서 중복된 값을 모두 제거한 후 남은 값을 오름차순으로 출력하는 프로그램을 작성하세요.
         * 만약 배열의 길이가 0이면 "빈 배열입니다."를 출력하세요.
         */
        Scanner scr = new Scanner(System.in);
        int arrayLength = 0;
        int arrayNum = 0;

        while(true){
            System.out.println("배열의 길이를 입력해주세요.");
            arrayLength = scr.nextInt();

            if (arrayLength == 0){
                System.out.println("빈 배열입니다.");
                continue;
            } else if (arrayLength == 1){
                // 중복된 값을 구할 수 없음
                System.out.println("1보다 큰 수를 입력해주세요.");
                continue;
            } else {
                break;
            }
        }


        // 입력한 숫자로 배열 만들기
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("배열의 숫자를 입력해 주세요");
            arrayNum = scr.nextInt();

            array[i] = arrayNum;
        }
    
        // 오름차순 정렬

        /* 하기와 같은 수식.
        for (int i = 1; i < iarr.length; i++) {
            for (int j = 0; j < i; j++) {
            }
        }
        */
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // for 문에서 i -> isTrue = true;로 주고
        // 배열[i]와 배열[i+1]가 같을 때 -> false 를 주고 이거를
        // false 인 배열의 i -> break;


        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++){

            boolean isTrue = true;
            for (int j = 0; j < i; j++){
                if(arrayNum == array[j]){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue == true){
                System.out.println(i);
            }


        }



        // 오름차순
        // 중복된 숫자 찾기
        // 중복된 숫자 만큼 배열 수 감소


    }
}
