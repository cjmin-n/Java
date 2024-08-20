package main.java.com.ohgiraffers.understand.chap01;


public class BankAccount {
    private int accountNumber;
    private String name;
    private double accountBalance;

    public BankAccount(int accountNumber, String name, double accountBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountBalance = accountBalance;
    }



    public void deposit (double money){
        if(money < 0){
            try{
                throw new Exception("입금은 양수만 가능합니다.");
            }catch(Exception e){
                System.out.println("입금은 양수만 가능 : " + e.getMessage());
            }
        }else {
            /*this.accountBalance += money;
            this.setAccountBalance(this.accountBalance);*/
            accountBalance += money;
            System.out.println(money + "원이 입금되었습니다. 현재 잔액은 " + accountBalance);
        }
    }


    public void withdraw (double money){

        if(this.accountBalance < money){
            try{
                throw new Exception("계좌잔액이 부족합니다.");
            }catch (Exception e){
                System.out.println("계좌잔고부족 : " + e.getMessage());
            }
        }else {
            /*this.accountBalance -= money;*/
            accountBalance -= money;
            System.out.println(money + "원이 출금되었습니다. 현재 잔액은 " + accountBalance);

        }
    }

    /*public void searchAccount (int accountNumber){
        System.out.println(this.getAccountBalance());
    }*/

    public double getAccountBalance() {
        return accountBalance;
    }
}
