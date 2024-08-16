package main.java.com.ohgiraffers.section04.use2;

public class Application {
    public static void main(String[] args) {

        Dicer dicer = new Dicer();

        dicer.throwDice(new SuperDice()); // 현재 위치는 6 입니다.
        dicer.throwDice(new HellDice()); // 현재 위치는 10 입니다.
    }
}
