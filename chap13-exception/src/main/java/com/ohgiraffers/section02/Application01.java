package main.java.com.ohgiraffers.section02;

public class Application01 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try{
            // 상품 가격보다 가진 돈이 적을 경우
            // et.checkEnoughMoney(50000, 3000);

            // 상품 가격이 음수인 경우
            // et.checkEnoughMoney(-5000, 5000);

            // 가진 돈이 음수일 경우
            //et.checkEnoughMoney(5000, -5000);

            et.checkEnoughMoney(3000, 5000);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
