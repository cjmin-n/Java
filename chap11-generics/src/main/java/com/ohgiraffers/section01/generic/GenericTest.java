package main.java.com.ohgiraffers.section01.generic;

public class GenericTest<T> {

    private T value; // 타입변수 - 일반적으로 대문자 T를 많이 사용

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }




}
