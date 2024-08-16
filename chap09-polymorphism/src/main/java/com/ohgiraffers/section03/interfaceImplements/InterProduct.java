package main.java.com.ohgiraffers.section03.interfaceImplements;

import java.io.Serializable;
import java.util.Comparator;

public interface InterProduct extends Serializable { // 인터페이스가 인터페이스를 상속받을 때는 extends 를 사용한다. 인터페이스끼리는 다중상속 제공

    /*
    * 인터페이스는 상수 필드만 작성 가능하다.
    * public static final 제어자 조합을 상수 필드라고 한다.
    * 하지만, 선언과 동시에 초기화 해 주어야 한다. - 인터페이스는 생성자가 없다.
    *
    * */

    public static final int MAX_NUM = 100; // public static final을 자동으로 추가해줘서 작성하지 않아도 된다.

    int MIN_NUM = 7;

    // 인터페이스는 생성자를 가질 수 없다.
    // public InterProduct(){}

    /*
    * 인터페이스 안에 작성한 메소드는 묵시적으로 public abstract 의 의미를 가진다.
    * - 다른 접근제어자 사용 불가
    * 따라서 인터페이스의 메소드를 오버라이딩 하는 경우
    * 반드시 접근 제어자를 public 으로 해야 가능하다.
    * */

    void abstMethod(); // 반환타입 메소드명만 작성해주면 된다.

    // static 키워드를 이용하여 작성하는 경우는 가능하다.
    public static void staticMethod(){
        System.out.println("interProduct 클래스의 static Method 호출");
    }



}
