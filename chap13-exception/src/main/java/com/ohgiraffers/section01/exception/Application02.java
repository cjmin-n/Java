package main.java.com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args) {

        // try-catch 를 이용한 예외처리

        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(10000, 5000);

            System.out.println("== 상품 구입 가능 ==");
        }catch (Exception e){
            System.out.println("money 가 price 보다 작습니다.");
            e.printStackTrace(); // 에러메시지를 담아서 보여주는 것.
        }

        System.out.println("프로그램 종료");
    }
}
