package main.java.com.ohgiraffers.section02.package_and_import;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 패키지란?
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음으로 단위를 구성하는 것을 말한다.
        * 같은 패키지 내에서는 동일한 이름의 클래스를 만들 수 없지만, 패키지가 다르면 동일한 이름을 가진 클래스를 만들 수 있다.
        * 클래스명은 원래 패키지명을 포함하고 있기 때문이다.
        * 지금까지는 클래스명에 패키지명을 함께 사용하지 않은 이유는 동일한 패키지 내에서 사용했기 때문이다.
        * */

        // 이전에 만든 Caculator 클래스를 사용해서 static 과 non-static 메소드 호출

        // 1. non-static 메소드 호출
        main.java.com.ohgiraffers.section01.method.Calculator calc = new main.java.com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumberOf(30, 20);
        System.out.println(min); // 20

        // 2. static 메소드 호출
        int max = main.java.com.ohgiraffers.section01.method.Calculator.maxNumberOf(30, 20);
        System.out.println(max); // 30
    }
}
