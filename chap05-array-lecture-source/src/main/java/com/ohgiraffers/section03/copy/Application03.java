package main.java.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 깊은 복사
        * heap 에 생성된 배열이 가지고 있는 값을
        * 또 다른 배열에 복사하는 것.
        *
        * 서로 같읕 값을 가지고 있지만, 두 배열은 서로 다른 배열이기에
        * 하나의 배열을 변경 하더라도 다른 배열에는 영향을 주지 않는다.
        * */

        /*
        * 깊은 복사를 하는 방법 4가지
        * 1. for 문을 이용한 동일 인덱스 값 복사
        * 2. object 의 clone 을 이용한 복사
        * 3. System 의 arraycopy() 를 이용한 복사
        * 4. Array 의 copyOf() 를 이용한 복사
        * */

        // 원본 배열
        int[] originArr = {1, 2, 3, 4, 5};
        print(originArr);
        // iarr.hashCode() = 1283928880
        // 1 2 3 4 5

        // 1. for 문을 이용한 동일 인덱스 값 복사
        int[] copyArr1 = new int[10];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }
        print(copyArr1);
        // iarr.hashCode() = 1989780873
        // 1 2 3 4 5 0 0 0 0 0

        // 2. Object 의 clone() 을 이용한 복사 -> 자바에서 모든 자료형(타입)의 최상위. 부모의 메서드를 자식이 사용할 수 있음.
        System.out.println("object clone : ");
        int[] copyArr2 = originArr.clone();
        print(copyArr2);
        // iarr.hashCode() = 1480010240
        // 1 2 3 4 5

        // 3. System 의 arraycopy() 를 이용한 복사 - 성능이 가장 좋음
        System.out.println("arraycopy : ");
        int[] copyArr3 = new int[10];
        System.arraycopy(originArr, 0, copyArr3, 3, originArr.length);
        // System.arraycopy(원본 배열, 원본 배열의 복사 시작 인덱스, 복사받을 배열, 복사받을 배열의 복사 시작 인덱스, 복사받을 배열 개수(원본 배열의 길이) );
        print(copyArr3);
        // iarr.hashCode() = 81628611
        // 0 0 0 1 2 3 4 5 0 0

        // 4. Arrays copyOf() 를 이용한 복사 - 가장 많이 사용
        System.out.println("copyOf : ");
        int[] copyArr4 = Arrays.copyOf(originArr, originArr.length);
        // int[] copyArr4 = Arrays.copyOf(originArr, originArr.length+1); // 1 2 3 4 5 0
        // Arrays.copyOf(원본 배열, 복사받을 배열의 길이 (원본배열의 길이보다 크면 자동으로 0(int 배열 초기값) 이 들어옴));
        print(copyArr4);
        // iarr.hashCode() = 1828972342
        // 1 2 3 4 5


    }

    // 배열을 넘기면 해시코드, 배열숫자 출력
    public static void print(int[] iarr){
        System.out.println("iarr.hashCode() = " + iarr.hashCode());

        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
}
