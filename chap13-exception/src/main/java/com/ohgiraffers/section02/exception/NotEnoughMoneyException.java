package main.java.com.ohgiraffers.section02.exception;

public class NotEnoughMoneyException extends Exception { // 예외 클래스를 만들기 위해서는 Exception 을 상속받아야 한다.

    public NotEnoughMoneyException() {
    }

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
