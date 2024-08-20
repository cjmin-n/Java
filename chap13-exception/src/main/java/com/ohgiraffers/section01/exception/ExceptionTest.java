package main.java.com.ohgiraffers.section01.exception;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        System.out.println("가지고 있는 돈은 " + money + " 원 입니다.");

        if(money >= price){
            System.out.println("상품을 구입하기 위한 돈이 충분합니다.");
        }else {

            /*
            * 강제로 예외 발생
            * 예외 발생 메소드 헤드에 throws 구문 추가.
            * 예외를 발생시킨 쪽에서 throws 로 예외에 대한
            * 책임을 위임해서 해당 예외에 대한 처리를 강제화 시킨다.
            * */
            throw new Exception();
        }


        System.out.println("즐거운 쇼핑하세요.");
    }
}
