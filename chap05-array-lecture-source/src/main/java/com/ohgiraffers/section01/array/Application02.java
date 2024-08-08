package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {


        /*
        * 배열의 사용 방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입
        * */

        // 자료형[] 변수명;
        // 자료형 변수명[]; 으로 선언할 수 있다.
        int[] iarray;
        int array[]; // Stack 영역에 Heap 의 주소를 받을 수 있는 공간을 만듦 -> new 를 만나야 heap 에 접근

        /*
        * 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 (레퍼런스주소)에 저장하여 이것을 사용하기 때문에 참조자료형(레퍼런스타입) 이라고 한다.
        * */

        // 배열을 할당할 시에는 반드시 배열의 크기를 지정해 주어야 한다.
        iarray = new int[5];
        array = new int[4]; // 크기 정하지 않으면 에러

        // 선언과 할당을 동시에 할 수 있다.
        int[] iarr2 = new int[5];
        System.out.println(iarr2); // 주소값 출력

        /*
        * char 배열만 특이하게 출력 시 값 자체가 출력됨. -> 문자열이기 때문
        * */
        char[] carr2 = new char[4];
        carr2[0] = 't';
        carr2[1] = 'e';
        carr2[2] = 's';
        carr2[3] = 't';
        System.out.println(carr2); // test

        System.out.println("iarray = " + iarray); // iarray = [I@404b9385
        System.out.println("array = " + array); // array = [I@6d311334
        System.out.println("iarr2 = " + iarr2); // iarr2 = [I@4c873330

        /*
        * hashCode()
        * 일반적으로 객체의 주소값을 10진수로 변환하여
        * 생성한 객체의 고유한 정수값을 반환한다.
        * 동일객체인지 비교할 때 사용할 목적으로 쓰인다.
        * */
        System.out.println("iarray = " + iarray.hashCode()); // iarray = 1078694789
        System.out.println("array = " + array.hashCode()); // array = 1831932724
        System.out.println("iarr2 = " + iarr2.hashCode()); // iarr2 = 1283928880

        /*
        * Stack 에서 각각의 다른 이름의 배열이 Heap 에서 같은 주소값을 가질 수 있다.
        * */

        // 스캐너를 통해 입력받은 정수로 배열 길이를 지정할 수 있다.
        Scanner scr = new Scanner(System.in);
        System.out.println("할당할 배열의 길이를 입력 해주세요 : ");
        int size = scr.nextInt();

        // 10을 넣었을 때
        int[] darr = new int[size];
        System.out.println("darr = " + darr.hashCode()); // darr = 20132171
        System.out.println("darr = " + darr.length); // darr = 10

        // 한 번 지정한 배열의 크기는 변경하지 못한다.
        darr = new int[30];
        System.out.println("darr = " + darr.hashCode()); // darr = 186370029
        System.out.println("darr = " + darr.length); // darr = 30
        // => 해시코드가 다름 ! 기존의 영역을 변경한 것이 아닌, 새롭게 만들어서 넣어준 것이다. 기존의 연결을 끊음(다시 찾지 못함)
        // garbage collector 가 어느 시점에 사용하지 않는 것(연결이 끊긴 배열)을 수거한다. 시점은 알 수 없음.
        
        // 아무것도 참조하고 있지 않음.
        darr = null;
        System.out.println("darr.hashCode() = " + darr.hashCode());
        System.out.println("darr = " + darr.length); // NullPointerException 발생 -> 아무것도 참조하지않는 것의 길이를 측정하라고 할 때 발생하는 에러.


    }
}
