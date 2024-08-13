package main.java.com.ohgiraffers.section09.initblock;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {


        /*
        * 초기화 블럭
        * 복잡한 초기화를 수행할 수 있는 블록을 제공하며,
        * 인스턴스 초기화 블록과 정적 초기화 블록으로 구분된다.
        * 1. 인스턴스 초기화 블록
        *   : 인스턴스가 생성되는 시점에 생성자 호출 이전에 먼저 실행된다.
        *     인스턴스를 호출하는 시점마다 호출이 된다.
        *     인스턴스변수를 초기화하며 정적필드에는 실행 시점마다 갚을 덮어쓴다.
        *
        *   {
        *       초기화 내용 작성
        *   }
        *
        * 2. 정적 초기화 블록
        *   : 클래스가 로드될 때 한 번 동작한다.
        *     정적 필드를 초기화 하며, 인스턴스 변수는 초기화 하지 못한다.
        *
        * static {
        *       초기화 내용 작성
        * }
        * */

        Product product = new Product();

        // 명시적 초기화 필드 값 확인
        System.out.println(product); // Product{name='갤럭시', price=10000000, brand=삼성}

        // 초기화블록 필드 초기화 확인
        System.out.println(product);
        /*
        정적 초기화 블록 동작함...
        인스턴스 초기화 블록 동작함...
        Product{name='아이폰', price=1500000, brand=애플}
        Product{name='아이폰', price=1500000, brand=애플} // 위의 값도 변경
        * */
        
        
        // 매개변수 있는 생성자
        Product product2 = new Product("대륙폰", 300000, "샤오미");
        System.out.println(product2);
        /*

        정적 초기화 블록 동작함...
        인스턴스 초기화 블록 동작함...
        기본 생성자 호출됨...
        Product{name='아이폰', price=1500000, brand=애플} // System.out.println(product);
        Product{name='아이폰', price=1500000, brand=애플} // System.out.println(product);

        인스턴스 초기화 블록 동작함...
        매개변수 있는 생성자 호출됨...
        Product{name='대륙폰', price=300000, brand=샤오미} // System.out.println(product2);
        * */
    }
}
