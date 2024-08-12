package main.java.com.ohgiraffers.section03.abstraction;

public class Car {


    private boolean isOn;
    private int speed;

    // 시동 걸기 - 시동이 걸려있는 상태의 경우는 할 일이 없고, 걸려있지 않은 상태인 경우 시동을 건다.
    public void startUp(){
        if(isOn){
            System.out.println("이미 시동이 걸려 있습니다.");
        }else {
            this.isOn = true;
            System.out.println("시동이 걸렸습니다.");
        }
    }

    // 시동이 걸린 상태에서만 호출 시마다 속도를 10km/h씩 증가시킨다.
    public void go(){
        if(isOn){
            if(speed == 0){
                System.out.println("자동차가 출발합니다.");
            }
            speed += 10;
            System.out.println("자동차의 시속은 현재 " + speed + "km/h 입니다.");
        }else {
            System.out.println("시동을 걸어야 출발 가능합니다.");
        }
    }

    // 시동이 걸려있고 달리는 상태인 경우에만 멈출 수 있다.
    public void stop(){
        if(isOn){
            if(this.speed > 0){
                while(this.speed > 0){
                    --this.speed;
                    System.out.println("현재속도" + this.speed + "km/h");
                }
                System.out.println("자동차가 멈췄습니다.");
            }else {
                System.out.println("이미 멈춰있는 상태입니다.");
            }
        }else {
            System.out.println("시동을 걸지 않은 경우 유압으로 인해 브레이크가 점점 무거워 집니다.");
        }
    }

    // 시동이 걸려있는 경우 시동을 끄고, 이미 꺼진 상태라면 끌 수 없다.
    public void turnOff(){
        if(isOn){
            if(this.speed != 0){
                System.out.println("달리는 상태에서 시동을 끄는 것은 위험합니다.");
            }else {
                this.isOn = false;
                System.out.println("시동을 끄겠습니다. 고생하셨습니다.");
            }
        }else {
            System.out.println("이미 시동이 꺼져있습니다.");
        }
    }


}
