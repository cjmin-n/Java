package main.java.com.ohgiraffers.section02.enumType;

public class Application {
    public static void main(String[] args) {

        // 열거 타입으로 선언된 인스턴스는 싱글톤으로 관리된다.
        Subjects subject1 = Subjects.JAVA;
        Subjects subject2 = Subjects.HTML;

        if(subject1 == subject2){
            System.out.println("두 과목은 같은 과목입니다.");
        }else {
            System.out.println("두 과목은 다른 과목입니다.");
        }

        // 단일 인스턴스임을 보장하기에 == 비교가 가능하다.
        System.out.println(subject1 == Subjects.JAVA); // true

        // 문자열로 변경하기 쉽다.
        System.out.println(Subjects.JAVA.toString()); // JAVA
        System.out.println(Subjects.JAVA); // toString() 생략 가능 - 오버라이드되어있음

        // values() 를 이용해서 상수값 배열을 반환하고
        // 이를 연속 처리할 수 있다. - 많이 사용되지않지만 된다는 것 확인
        Subjects[] subjects = Subjects.values();

        for(Subjects s : subjects){
            System.out.println(s);
            /*
            JAVA
            MYSQL
            JDBC
            HTML
            CSS
            JAVASCRIPT
            * */
        }


        // 타입 안전성을 보장한다.
        printSubject(Subjects.HTML); // HTML

    }

    public static void printSubject(Subjects subject){
        System.out.println(subject.toString());
    }
}
