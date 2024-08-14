package main.java.com.ohgiraffers.section02.understand.car;

public class Car {

    private final String brand;
    private int price;
    private String name;

    // 자동차가 꼭 세가지 변수가 필요하기 때문에
    public Car(String brand, int price, String name) {
        this.brand = brand;
        this.price = price;
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
