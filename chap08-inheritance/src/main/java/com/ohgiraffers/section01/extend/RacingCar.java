package main.java.com.ohgiraffers.section01.extend;

public class RacingCar extends Car{


    public RacingCar() {
        System.out.println("RacingCar의 기본 생성자 호출");
    }

    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주합니다.");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱 카는 경적을 울릴 수 없습니다.");
    }

    @Override
    public void stop() {
        System.out.println("레이싱 카가 멈춥니다.");
    }




}
