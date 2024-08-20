package main.java.com.ohgiraffers.understand.chap01;


public class BankAccount {
    private int accountNumber;
    private String name;
    private int accountBalance;

    public BankAccount() {
    }

    public BankAccount(int accountNumber, String name, int accountBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit (int money){
        if(money < 0){
            try{
                throw new Exception("입금은 양수만 가능합니다.");
            }catch(Exception e){
                System.out.println("입금은 양수만 가능 : " + e.getMessage());
            }
        }else {
            this.accountBalance += money;
            this.setAccountBalance(this.accountBalance);
        }
    }


    public void withdraw (int money){

        if(this.accountBalance < money){
            try{
                throw new Exception("계좌잔액이 부족합니다.");
            }catch (Exception e){
                System.out.println("계좌잔고부족 : " + e.getMessage());
            }
        }else {
            this.accountBalance -= money;
        }
    }

    public void searchAccount (int accountNumber){
        System.out.println(this.getAccountBalance());
    }
}
