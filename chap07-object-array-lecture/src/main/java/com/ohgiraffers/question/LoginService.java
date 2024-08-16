package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class LoginService {

   //  static int count = 0;

    public void signUp(){

        Scanner scr = new Scanner(System.in);

        String id;
        String name;
        String pwd;
        String pwdCheck;

        System.out.println("== 회원가입을 진행합니다. ==");

        System.out.println("아이디를 입력해주세요");
        id = scr.nextLine();

        System.out.println("이름을 입력해주세요.");
        name = scr.nextLine();

        while(true){
            System.out.println("비밀번호를 입력해주세요.");
            pwd = scr.nextLine();

            System.out.println("비밀번호를 확인해주세요.");
            pwdCheck = scr.nextLine();

            if(!pwd.equals(pwdCheck)){
                System.out.println("비밀번호가 같지 않습니다.");
                continue;
            }else {
                break;
            }
        }

        /*User[] user = new User[10];

        if(count < 10){
            user[count] = new User(id, name, pwd);
        }*/

        User user = new User(id, name, pwd);

        if(LoginRepository.signUp(user)){
            System.out.println("회원가입에 성공했습니다.");
            // count++;
        }else {
            System.out.println("회원가입을 할 수 없습니다.");
        }


    }
    public boolean login(){

        Scanner scr = new Scanner(System.in);

        String id;
        String pwd;

        System.out.println("== 로그인을 진행합니다. ==");

        System.out.println("아이디를 입력해주세요");
        id = scr.nextLine();

        System.out.println("비밀번호를 입력해주세요.");
        pwd = scr.nextLine();

        User user = new User(id, pwd);


        if(LoginRepository.login(user)){
            System.out.println("로그인에 성공하셨습니다.");
            System.out.println("프로그램을 종료합니다.");

            //System.exit(0);
            return true;
        }else {
            return false;
        }

    }

}
