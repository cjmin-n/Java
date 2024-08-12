package main.java.com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application02 {
    public static void main(String[] args) {

        // 순차정렬

        int[] iarr = {2, 5, 4, 6, 1, 3};

        for (int i = 1; i < iarr.length; i++) {
            for (int j = 0; j < i; j++) {

                if(iarr[i] < iarr[j]){ // 오름차순 | iarr[i] > iarr[j] : 내림차순
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;
                }
            }
        }

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        // 선택 정렬
        int[] iarr1 = {2, 5, 4, 1, 6, 3};

        int min;
        int temp;

        // 배열의 첫번째부터 다음수 ~ 끝까지 비교해서 작은 값에 큰 값 대입
        for (int i = 0; i < iarr1.length; i++) {
            min = i; // 0 1 2 3 4 5
            for (int j = i+1; j < iarr1.length; j++) { // 1 2 3 4 5
                if(iarr1[min] > iarr1[j]){ // iarr[0] > iarr[3]
                    min = j; // min = 3;
                }

            }

            /*
                System.out.println(Arrays.toString(iarr1));
                [2, 5, 4, 1, 6, 3]
                [1, 5, 4, 2, 6, 3]
                [1, 2, 4, 5, 6, 3]
                [1, 2, 3, 5, 6, 4]
                [1, 2, 3, 4, 6, 5]
                [1, 2, 3, 4, 5, 6]
                [1, 2, 3, 4, 5, 6]
            * */

            //  System.out.println(Arrays.toString(iarr1));
            //  [2, 5, 4, 1, 6, 3]

            // System.out.print (iarr1[min] + " ");
            // -> 1 2 3 4 5 6

            // 배열에 정렬된 값을 넣어줌
            temp = iarr1[min];
            iarr1[min] = iarr1[i];
            iarr1[i] = temp;

            // System.out.println(iarr1[min] + " " + iarr1[i]);
            // iarr1[min] : 원래값 | iarr1[i] : 정렬한 값;
        }

        System.out.println(Arrays.toString(iarr1));

    }
}
