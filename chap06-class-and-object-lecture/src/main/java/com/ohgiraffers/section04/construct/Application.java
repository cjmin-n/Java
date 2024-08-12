package main.java.com.ohgiraffers.section04.construct;

public class Application {
    public static void main(String[] args){

        // 클래스명 변수명 = new 클래스명();

        /*
        * 생성자란 ?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고,
        * 인스턴스를 생성할 때 호출된다. 생성자 함수에 매개변수가 없는 생성자를
        * 기본생성자 라고 하며, 기본생성자는 컴파일러에 의해 자동으로 추가되기 때문에
        * 지금까지 명시적으로 작성하지 않은 것이다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에
        * 아무것도 작성하지 않은 것이다.)
        * */

        // 기본 생성자 호출
        User user1 = new User(); // 기본 생성자 호출됨....
        System.out.println(user1.getInformation()); // User id : null, pwd : null, name : null, enrollDate : null

        // 전체 필드 초기화 생성자 호출
        User user2 = new User("user01", "pass01", "홍길동", new java.util.Date());
        System.out.println(user2.getInformation()); // User id : user01, pwd : pass01, name : 홍길동, enrollDate : Mon Aug 12 15:03:24 KST 2024 (현재 날짜,시간 출력)

        // id, pwd 를 매개변수로 전달받는 생성자 호출
        User user3 = new User("user02", "pass02");
        System.out.println(user3.getInformation()); // User id : user02, pwd : pass02, name : null, enrollDate : null

    }
}
