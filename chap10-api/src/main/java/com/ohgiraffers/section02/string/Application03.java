package main.java.com.ohgiraffers.section02.string;

import java.util.StringTokenizer;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 문자열 분리
        * - 문자열을 특정 구분자로 분리한 문자열을 반환하는 기능
        *
        * split() : 정규표현식을 이용하여 문자열을 분리한다.
        *   비정형화된 문자열을 분리할 때 좋지만
        *   정규표현식을 이용하기 떄문에 속도가 느리다는 단점을 가진다.
        *   정규표현식은 자바에서는 다루지 않고 자바스크립트에서 다룰 예정이다.
        * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
        *   정형화된 문자열 패턴을 분리할 때 사용하기 좋다.
        *   split 보다 속도면에서 더 빠르다.
        * */

        String emp1 = "100/홍길동/서울/영업부"; // 모든 값 존재
        String emp2 = "200/유관순//총무부"; // 주소 없음
        String emp3 = "300/이순신/경기도/"; // 부서 없음

        String[] empArr1 = emp1.split("/");
        String[] empArr2 = emp2.split("/");
        String[] empArr3 = emp3.split("/");

        for (int i = 0; i < empArr1.length; i++) {
            System.out.println("empArr1["+i+"] : " + empArr1[i]);
            /*
            empArr[0] : 100
            empArr[1] : 홍길동
            empArr[2] : 서울
            empArr[3] : 영업부
            * */
        }
        for (int i = 0; i < empArr2.length; i++) {
            System.out.println("empArr2["+i+"] : " + empArr2[i]);
            /*
            empArr2[0] : 200
            empArr2[1] : 유관순
            empArr2[2] :
            empArr2[3] : 총무부
            * */
        }
        for (int i = 0; i < empArr3.length; i++) {
            System.out.println("empArr3["+i+"] : " + empArr3[i]);
            /*
            empArr3[0] : 300
            empArr3[1] : 이순신
            empArr3[2] : 경기도
            * */
        }
        // 중간의 공백문자는 포함되고, 마지막은 포함안된다.

        String[] empArr4 = emp3.split("/", -1); // 음수 or 구분자보다 더 큰 숫자를 넣어주면 끝까지 쪼개준다. (마지막 공백 포함)
        for (int i = 0; i < empArr4.length; i++) {
            System.out.println("empArr4["+i+"] : " + empArr4[i]);
            /*
            empArr4[0] : 300
            empArr4[1] : 이순신
            empArr4[2] : 경기도
            empArr4[3] :
            * */
        }


        StringTokenizer st1 = new StringTokenizer(emp1, "/"); // 뒤에 매개변수를 생략하면 공백을 구분자로 해준다.
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");

        while(st1.hasMoreTokens()){ // 다음 인덱스가 있는지
            System.out.println("st1 : " + st1.nextToken());
            /*
            st1 : 100
            st1 : 홍길동
            st1 : 서울
            st1 : 영업부
            * */
        }
        while(st2.hasMoreTokens()){ // 다음 인덱스가 있는지
            System.out.println("st2 : " + st2.nextToken());
            /*
            st2 : 200
            st2 : 유관순
            st2 : 총무부
            * */
        }
        while(st3.hasMoreTokens()){ // 다음 인덱스가 있는지
            System.out.println("st3 : " + st3.nextToken());
            /*
            st3 : 300
            st3 : 이순신
            st3 : 경기도
            * */
        }
        // StringTokenizer는 모든 공백을 무시한다.


        String colorStr = "red*orange#blue/yellow green"; // 구분자를 다르게 해줌 - 이런 경우 split을 사용하지 못함
        // String[] colors = colorStr.split("*#/ "); //에러.

        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*#/ "); // 각각의 구분자로 사용하겠다는 뜻

        while(colorStringTokenizer.hasMoreTokens()){
            System.out.println(colorStringTokenizer.nextToken());
            /*
            red
            orange
            blue
            yellow
            green
            * */
        }


    }
}
