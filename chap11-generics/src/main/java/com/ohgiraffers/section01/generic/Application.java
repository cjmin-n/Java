package main.java.com.ohgiraffers.section01.generic;

import java.util.Map;

public class Application {
    public static void main(String[] args) {

        /*
        * 제네릭
        * 제네릭이란 사전적인 의미로 일반적인 이라는 의미이다.
        * 자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다.
        *
        * 코드의 안전성을 높이고, 중복 코드를 줄이며, 더 유연하고
        * 재사용 가능한 코드를 작성할 수 있다.
        *
        * 제네릭은 클래스나 메소드에 사용할 내부 데이터 타입을
        * 컴파일 시에 지정하는 방법을 말한다.
        * 컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나
        * 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있으며,
        * 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드
        * 생략이 가능해진다.
        *
        * */

        // 타입을 Integer 로 인스턴스를 생성하는 경우
        GenericTest<Integer> gt1 = new GenericTest<>();

        gt1.setValue(10);
        System.out.println(gt1.getValue()); // 10
        System.out.println(gt1.getValue() instanceof Integer); // true - 인자/반환값 Integer

        // String 으로 인스턴스를 생성하는 경우
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("홍길동");
        System.out.println(gt2.getValue()); // 홍길동
        System.out.println(gt2.getValue() instanceof String); // true

        GenericTest<Double> gt3 = new GenericTest<>();
        gt3.setValue(0.5);
        System.out.println(gt3.getValue()); // 0.5
        System.out.println(gt3.getValue() instanceof Double); // true

    }
}
