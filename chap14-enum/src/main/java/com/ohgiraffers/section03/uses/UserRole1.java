package main.java.com.ohgiraffers.section03.uses;

public enum UserRole1 {

    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN; // 필드 외에 밑에 다른 내용을 추가하려면 ; 을 추가해야 한다.

    // ENUM 은 상수 하나하나가 인스턴스화 된다.


    UserRole1(){
        System.out.println("기본생성자 호출됨"); // 호출은 가능 - 상수 개수 만큼 !
    }
    // enum 타입은 고정된 상수들의 집합으로, 런타임 시가 아닌 컴파일 시에
    // 모든 값이 결정되어 있어야 한다.

    /* -> 생성자를 가질 수 있지만 사용하지 못함.
        묵시적으로 private 가 붙음
        static 붙어있고, 싱글톤으로 사용되기 때문에 생성자가 의미가 없다. */


    //필요한 경우 메소드도 만들 수 있다.
    public String getNameToLowerCase(){
        return this.name().toLowerCase(); // name()이 상수를 의미
    }



}
