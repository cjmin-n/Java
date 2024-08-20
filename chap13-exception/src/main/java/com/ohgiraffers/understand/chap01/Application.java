package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String name;
        int accountNumber;
        double accountBalance;

        System.out.println("=== 은행 시스템 ===");
        System.out.println("이름을 입력해주세요.");
        name = scr.nextLine();

        System.out.println("계좌번호를 입력해주세요.");
        accountNumber = scr.nextInt();

        System.out.println("잔액을 입력해주세요.");
        accountBalance = scr.nextDouble();

        BankAccount ba = new BankAccount(accountNumber, name, accountBalance);


        while (true) {

            System.out.println("은행 업무를 선택해주세요. (숫자)");
            System.out.println("1. 입금하기");
            System.out.println("2. 출금하기");
            System.out.println("3. 잔액조회");
            System.out.println("9. 프로그램 종료");
            int no = scr.nextInt();
            scr.nextLine();

            switch (no){

                case 1 :
                    System.out.println("계좌번호를 입력해주세요.");
                    accountNumber = scr.nextInt();
                    System.out.println("입금을 돈을 입력해주세요.");
                    Double depositMoney = scr.nextDouble();

                    ba.deposit(depositMoney);

                    break;
                case 2 :
                    System.out.println("계좌번호를 입력해주세요.");
                    accountNumber = scr.nextInt();

                    System.out.println("출금을 돈을 입력해주세요.");
                    Double withdrawMoney = scr.nextDouble();
                    ba.withdraw(withdrawMoney);

                    break;
                case 3 :
                    System.out.println("계좌번호를 입력해주세요.");
                    accountNumber = scr.nextInt();

                    System.out.println( "잔액은 " + ba.getAccountBalance() + "입니다.");
                    break;

                case 9 :
                    System.out.println("프로그램을 종료합니다!");
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
                    continue;
            }

        }
    





        
        

    }
}
