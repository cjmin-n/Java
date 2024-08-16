package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

import java.util.HashMap;
import java.util.Map;

public class Application03 {
    public static void main(String[] args) {

        /*
        * Object 클래스의 명세에 작성된 일반 규약에 따르면
        * equals() 메소드를 재정의 하는 경우 반드시 hashCode() 도
        * 재정의 하도록 되어 있다.
        * 만약 hashCode() 를 재정의 하지 않으면 같은 값을 가지는
        * 동등객체는 같은 해시코드 값을 가져야 한다는 규약에 위반하게 된다.
        * (강제성은 없지만 규약대로 하는게 좋다.)
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1.hashCode() = " + book1.hashCode()); // book1.hashCode() = 295530567
        System.out.println("book2.hashCode() = " + book2.hashCode()); // book2.hashCode() = 1989780873

        // hashCode() 오버라이드 한 후 결과값 -> 해시코드 동일하게 변경
        /*
        book1.hashCode() = -1619022418
        book2.hashCode() = -1619022418
        * */


        // hashCode 를 재정의 하지 않았을 때 문제점
        Map<Book, String> map = new HashMap<>(); // Map<key, 자료형>
        map.put(new Book(1, "홍길동전", "허균", 50000), "selled"); // put() : map에 저장

        String str = map.get(new Book(1, "홍길동전", "허균", 50000)); // get() 은 추출

        System.out.println(str);
        // null -> 해시코드로 비교하기 때문에 null 이 나옴 // -> hashCode()오버라이드 주석처리 후 확인
        // selled -> hashCode() 오버라이드한 후 상기 str의 출력값




    }
}
