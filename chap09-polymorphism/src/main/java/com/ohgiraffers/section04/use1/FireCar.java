package main.java.com.ohgiraffers.section04.use1;

public class FireCar extends Car implements Soundable{

    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }
    // 구현 책임을 다르게 해줬다.
    @Override
    public void horn() {
        System.out.println("소방차가 경적을 울립니다.");
    }
}
