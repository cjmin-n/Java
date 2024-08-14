package main.java.com.ohgiraffers.section02.understand.employee;

import main.java.com.ohgiraffers.section02.understand.car.Car;
import main.java.com.ohgiraffers.section02.understand.car.ElectricCar;

public class Seller {

    private String name;
    private double result; // 판매 수당

    // 이름은 꼭 넣어줘야한다.
    public Seller(String name) {
        this.name = name;
    }

    public void sale(Car[] cars){
        for(Car car : cars){
            if(car instanceof ElectricCar){ // instanceof : 어떤 클래스에 해당하는 변수인지 확인
                // ((ElectricCar) car).getEnergy(); // 자식으로 형변환해야 사용가능 - 자식의 메소드를 사용하고 싶을 때
                System.out.println(car.getBrand() + "사의 " + car.getName() + "를 판매 하였습니다.");
                result += car.getPrice(); // 동적 바인딩(다형성) : 하나의 메소드로 여러 클래스를 실행시킬 수 있다. 프로그램 실행 시에 어느 타입인지 결정된다.
            }else {
                System.out.println(car.getBrand() + "사의 " + car.getName() + "를 판매 하였습니다.");
                result += car.getPrice();
                // if, else의 실행문은 같지만 ElectricCar와 OldCar의 getPrice() 메소드 실행문이 다르기 때문에, 다르게 계산된다.
            }
        }
    }


    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';
    }
}
