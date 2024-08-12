package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private final Car car = new Car();
    
    /**
     * this.car 의 시동을 거는 메소드
     * */
    public void startUp(){
        car.startUp();
    }
    
    /**
     * this.car go 메소드를 호출하여 앞으로 가는 메소드
     * */
    public void stepAccelator(){
        car.go();
    }

    /**
     * this.car 를 멈추는 메소드
     * */
    public void stepBreak(){
        car.stop();
    }

    /**
     * this.car 의 시동을 끄는 메소드
     * */
    public void turnOff(){
        car.turnOff();
    }


    
}
