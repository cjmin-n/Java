package main.java.com.ohgiraffers.section06.parameter;

public class Application {
    public static void main(String[] args) {

        // 메소드의 파라미터에 대해 이해하고 사용할 수 있다.

        /*
        * 매개변수로 사용 가능한 자료형
        * 1. 기본 자료형
        * 2. 기본 자료형 배열
        * 3. 클래스 자료형
        * 4. 클래스 자료형 배열
        * 5. 가변인자
        *
        * */

        ParameterTest pt = new ParameterTest();

        int num = 20;
        pt.testPrimaryTypeParameter(num);

        int[] iarr = {1,2,3,4,5,6,7};

        System.out.println("인자로 전달하는 값 : " + iarr); // 인자로 전달하는 값 : [I@58372a00
        pt.testPrimaryTypeArrayParameter(iarr);
        /*
        * 매개변수로 전달 받은 값 : [I@58372a00
            배열의 값 출력 :
            1 2 3 4 5 6 7
            99 2 3 4 5 6 7
        * */
        System.out.println("변경 후 원본 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) { // 99 2 3 4 5 6 7
            System.out.print(iarr[i] + " ");
        }
        System.out.println();


        // 클래스 자료형
        RectAngle r1 = new RectAngle(12.5, 22.5);
        System.out.println("인자로 전달하는 r1의 값 : " + r1); // 인자로 전달하는 r1의 값 : RectAngle{width=12.5, height=22.5} -> toString 재정의한대로 출력

        r1.calcArea(); // 사각형의 넓이는 : 281.25
        r1.calcRound(); // 사각형의 둘레는 : 70.0

        pt.testClassTypeParameter(r1);
        /*
        * 매개변수로 전달받은 값 : RectAngle{width=12.5, height=22.5}
            변경 전 사각형의 넓이와 둘레 =====
            사각형의 넓이는 : 281.25
            사각형의 둘레는 : 70.0
            변경 후 사각형의 넓이와 둘레 =====
            사각형의 넓이는 : 10000.0
            사각형의 둘레는 : 400.0

        * */
        System.out.println("변경 후 사각형의 넓이와 둘레 : ");
        r1.calcArea(); // 사각형의 넓이는 : 10000.0
        r1.calcRound(); // 사각형의 둘레는 : 400.0



        // 가변인자
        // 인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변배열을 활용할 수 있다.
        pt.testVariableLengthArrayParameter("홍길동");
        /*
        * 이름 : 홍길동
        취미의 갯수 : 0
        취미 :
        * */
        pt.testVariableLengthArrayParameter("유관순", "볼링");
        /*
        * 이름 : 유관순
        취미의 갯수 : 1
        취미 :
        볼링
        * */
        pt.testVariableLengthArrayParameter("이순신", "볼링", "축구", "당구");
        /*
        * 이름 : 이순신
        취미의 갯수 : 3
        취미 :
        볼링 축구 당구
        * */
        pt.testVariableLengthArrayParameter("신사임당", new String[]{"테니스", "서예", "당구"});
        /*
        * 이름 : 신사임당
        취미의 갯수 : 3
        취미 :
        테니스 서예 당구
        * */
    }
}
