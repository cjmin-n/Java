package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        while (true) {
            Scanner scr = new Scanner(System.in);
            String name;
            int accountNumber;
            int depositMoney;
            BankAccount ba = new BankAccount();

            System.out.println("=== 은행 시스템 ===");
            System.out.println("은행 업무를 선택해주세요. (숫자)");
            System.out.println("1. 신규 계좌발급");
            System.out.println("2. 입금하기");
            System.out.println("3. 출금하기");
            System.out.println("4. 잔액조회");
            System.out.println("9. 프로그램 종료");
            int no = scr.nextInt();
            scr.nextLine();

            switch (no){

                case 1 :
                    System.out.println("이름을 입력해주세요.");
                    name = scr.nextLine();

                    System.out.println("계좌번호를 입력해주세요.");
                    accountNumber = scr.nextInt();

                    break;
                case 2 :
                    System.out.println("계좌번호를 입력해주세요.");
                    accountNumber = scr.nextInt();
                    System.out.println("입금을 돈을 입력해주세요.");
                    depositMoney = scr.nextInt();

                    ba.deposit(depositMoney);

                    break;
                case 3 :
                    System.out.println("계좌번호를 입력해주세요.");
                    accountNumber = scr.nextInt();

                    System.out.println("출금을 돈을 입력해주세요.");
                    int withdrawMoney = scr.nextInt();
                    ba.withdraw(withdrawMoney);

                    break;
                case 4 :
                    System.out.println("계좌번호를 입력해주세요.");
                    accountNumber = scr.nextInt();

                    ba.searchAccount(accountNumber);
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
