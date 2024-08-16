package main.java.com.ohgiraffers.section02;

public abstract class Product {

    private int nonStaticField; // 필드를 가질 수 있다.
    private static int staticField;

    public Product() { // 생성자를 가질 수 있다.
    }

    public void nonStaticMethod(){ // 일반 메소드를 가질 수 있다.
        System.out.println("Product 클래스의 nonStaticMethod 를 호출함");
    }

    public static void staticMethod(){
        System.out.println("Product 클래스의 staticMethod 를 호출함");
    }

    public abstract void abstractMethod(); // 특정메소드를 갖는것을 강제화할 수 있고, 내용은 하위 클래스에서 각각 다르게 작성.


}
