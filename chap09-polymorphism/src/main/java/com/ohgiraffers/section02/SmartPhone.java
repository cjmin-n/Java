package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product { // 추상메소드를 오버라이드 안해줘서


    public SmartPhone() {
    }

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 추상메소드를 호출함");
    }

    public void printSmartPhone(){
        System.out.println("smartPhone 의 print 메소들 호출함");
    }
}
