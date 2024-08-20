package main.java.com.ohgiraffers.understand.chap01;

public class BankAccount01 {
    private int accountNumber;
    private String name;
    private int accountBalance;
    private int count;


    public BankAccount01[] bankAccounts = new BankAccount01[10];

    public BankAccount01() {
    }

    public BankAccount01(int accountNumber, String name, int accountBalance) {
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


    public void account(BankAccount01 bankAccount){
        for(BankAccount01 account : bankAccounts){
            bankAccounts[count++] = bankAccount;
        }
    }

    public void deposit (BankAccount01 bankAccount, int money){

        System.out.println("넘어옴");
        for(BankAccount01 account : bankAccounts){
            if(account == null ){

            }
            if(account.accountNumber != bankAccount.accountNumber){
                System.out.println("입력하신 계좌가 없습니다.");
                return;
            }
        }

        if(money < 0){
            try{
                throw new Exception("입금은 양수만 가능합니다.");
            }catch(Exception e){
                System.out.println("입금은 양수만 가능 : " + e.getMessage());
            }
        }else {
            accountBalance += money;
        }

    }


    public void withdraw (int money){
        if(accountBalance < money){
            try{
                throw new Exception("계좌잔액이 부족합니다.");
            }catch (Exception e){
                System.out.println("계좌잔고부족 : " + e.getMessage());
            }
        }else {
            accountBalance -= money;
        }
    }

    public void searchAccount (int accountNumber){
        System.out.println(accountBalance);
    }
}
