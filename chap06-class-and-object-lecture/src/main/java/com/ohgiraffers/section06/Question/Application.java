package main.java.com.ohgiraffers.section06.Question;

public class Application {
    public static void main(String[] args) {
        // 기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        // 필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        // 모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력

        BookDTO book = new BookDTO();
        book.printInformation();

        BookDTO book2 = new BookDTO();

        book2.setTitle("자바의 정석");
        book2.setPublisher("도우출판");
        book2.setAuthor("남궁성");

        book2.printInformation();

        BookDTO book3 = new BookDTO();
        book3.setTitle("홍길동전");
        book3.setPublisher("활빈당");
        book3.setAuthor("허균");
        book3.setPrice(5000000);
        book3.setDiscountRate(0.5);
        book3.printInformation();

    }
}
