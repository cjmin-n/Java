package main.java.com.ohgiraffers.section02;

import main.java.com.ohgiraffers.section02.exception.MoneyNegativeException;
import main.java.com.ohgiraffers.section02.exception.NotEnoughMoneyException;
import main.java.com.ohgiraffers.section02.exception.PriceNegativeException;

public class Application02 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(1000, 5000);
        }catch(NotEnoughMoneyException e){
            e.printStackTrace();
        }catch(PriceNegativeException | MoneyNegativeException e){ // 형제들은 같이 사용할 수 있다.
            e.printStackTrace();
        }finally {
            System.out.println("무조건 마지막에 동작함");
        }


    }
}
