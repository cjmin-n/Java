package main.java.com.ohgiraffers.section02.understand.car;

public class ElectricCar extends Car{ // Car의 생성자를 전체초기화 생성자 밖에 안만들어서 오류

    private String energy;

    public ElectricCar(String brand, int price, String name, String energy) {
        super(brand, price, name); // Car의 기본생성자가 없기 때문에 만들어짐.
        this.energy = energy;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    @Override
    public double getPrice() {
        System.out.println("전기차의 판매가는 " + super.getPrice() + "원 입니다.");
        return super.getPrice() * 0.15;
    }

    @Override
    public String toString() {
        return "ElectricCar = carName = " + super.getName() + ", energy = " + energy;
    }
}
