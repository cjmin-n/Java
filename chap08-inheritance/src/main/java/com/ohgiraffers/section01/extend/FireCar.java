package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    public FireCar() {
        super(); // 모든 생성자에 호출됨. 생략되어있고 부모의 생성자를 호출하는 구문이다. 아무것도 없을 때는 Object를 상속받는다.

    }

    @Override
    public void soundHorn() { // 오버라이드 시 접근제어자, 반환타입, 메소드명은 동일하게 해야한다.
        if(isRunning()){ // 따로 안만들어도 쓸 수 있음
            System.out.println("빠아아아아아아아앙");
        }else {
            System.out.println("소방차가 멈춰있습니다.");
        }
    }

    // 확장 : 부모가 가진것 +추가(sprayWater())
    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");
    }


}
