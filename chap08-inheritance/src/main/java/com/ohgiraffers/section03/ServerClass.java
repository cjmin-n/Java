package main.java.com.ohgiraffers.section03;

public class ServerClass extends SuperClass{

    // 메소드 이름을 변경하면 에러가 발생한다.
    /*@Override
    public void method2(int num){
        super.method(num);
    }*/

    // 메소드의 리턴타입이 변경되면 에러가 발생한다.
    /*@Override
    public int method(int num) {
        super.method(num);
    }*/

    // 시그니처가 달라도 오류가 발생한다.
    /*@Override -> 오버로딩
    public void method(int num, int num2) {
        super.method(num);
    }*/

    @Override
    public void method(int num) {
        super.method(num);
    }

    // private 접근자는 접근할 수 없다.
    /*@Override
    public void privateMethod(){}*/

    // final은 한번 정의된 후 변경이 불가능하다.
    /*@Override
    public final void finalMethod(){}*/

    // 접근제어자는 같거나 더 넓은 범위로만 가능하다.
    @Override
    public void protectedMethod(){} // public 과 protected 는 가능하다.
    // default, private 는 불가능하다.



}
