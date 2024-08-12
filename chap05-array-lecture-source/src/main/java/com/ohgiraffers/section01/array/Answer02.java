package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Answer02 {
    public static void main(String[] args) {
        /*
         * 배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만든 후,
         * 배열에서 중복된 값을 모두 제거한 후 남은 값을 오름차순으로 출력하는 프로그램을 작성하세요.
         * 만약 배열의 길이가 0이면 "빈 배열입니다."를 출력하세요.
         */
        // 배열의 길이 입력받기
        Scanner scr = new Scanner(System.in);
        System.out.print("배열의 길이를 입력하세요: ");
        int n = scr.nextInt();

        if (n == 0) {
            System.out.println("빈 배열입니다.");
            return;
        }

        // 배열 요소 입력받기
        int[] array = new int[n];
        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < n; i++) {
            array[i] = scr.nextInt();
        }

        // 버블 정렬을 사용하여 배열을 오름차순 정렬

        // 반복이 끝날 때마다 가장 큰 값이 배열의 끝에 위치
        for (int i = 0; i < n - 1; i++) {
            // j < n-1-i 조건은 내부 루프가 이미 정렬된 요소들을 제외하고 남은 부분만 비교
            for (int j = 0; j < n - 1 - i; j++) {

                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
            }
        }

        // 중복 제거를 위한 임시 배열
        int[] tempArray = new int[n];
        int j = 0;

        // 중복을 제거하며 tempArray에 값 추가
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j++] = array[i];
            }
        }
        // 마지막 요소는 중복되지 않으므로 추가
        tempArray[j++] = array[n - 1];

        // 중복이 제거된 배열 출력
        System.out.println("중복을 제거하고 정렬한 배열:");
        for (int i = 0; i < j; i++) {
            System.out.print(tempArray[i] + " ");
        }

    }
}
