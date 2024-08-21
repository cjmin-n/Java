package main.java.com.ohgiraffers.section03.uses;

public enum UserRole2 {

    GUEST("게스트"),
    CONSUMER("구매자"),
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description;

    UserRole2(String description) {
        this.description = description;
    } // 호출 시 에 기본생성자 생성하면 상수 뒤에 ()안에 있는 값들이 생성자의 매개변수로 들어감.

    public String getDescription() {
        return this.description;
    }

}
