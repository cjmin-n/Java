package main.java.com.ohgiraffers.section03.interfaceImplements;

public class Product extends Object implements InterProduct { // 추상메소드가 구현되지 않아서

    /*
    * 클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속받을 수 있으며,
    * extends 로 다른 클래스를 상속 받는 경우에도 그것과 별개로
    * 추가 상속이 가능해진다. 단 extends 를 앞에 작성하고
    * 뒤에 implements 를 작성한다. - 순서 바뀌면 에러 발생
    * */

    @Override
    public void abstMethod() {
        System.out.println("interProduct 의 abstMehotd 오버라이딩 메소드 호출");
    }

    // static 메소드는 재정의 불가능
    /*@Override
    public static void staticMethod(){}*/

    
}
