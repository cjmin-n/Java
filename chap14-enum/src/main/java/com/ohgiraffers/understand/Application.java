package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        StudentManger studentManger;
        Students[] students = Students.values();

        while(true){
            System.out.println("==== 학생 성적 관리 시스템 ====");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학년별 학생 목록 보기");
            System.out.println("3. 성적 수정");
            System.out.println("4. 학생 정보 삭제");
            System.out.println("9. 프로그램 종료");

            int choice = scr.nextInt();
            scr.nextLine();

            switch (choice) {
                case 1 :
                    // 1. 학생 추가
                    System.out.println("이름을 입력해주세요.");
                    String name = scr.nextLine();
                    System.out.println("학번을 입력해주세요. (숫자만 입력)");
                    int num = scr.nextInt();
                    scr.nextLine();
                    System.out.println("학년을 입력해주세요. (숫자 1 ~ 4 입력)");
                    int gradeInt = scr.nextInt();
                    /*String grade = gradeInt + "학년";*/
                    System.out.println("성적을 입력해주세요. (숫자만 입력)");
                    int score = scr.nextInt();

                    String grade = "";
                    if(gradeInt == 1){
                        grade = Students.FRESHMAN.toString();
                    }else if(gradeInt == 2){
                        grade = Students.SOPHOMORE.toString();
                    }else if(gradeInt == 3){
                        grade = Students.JUNIOR.toString();
                    }else if(gradeInt == 4){
                        grade = Students.SENIOR.toString();
                    }





                    // studentManger.add(, new StudentDTO(name, num, score))

                    break;

                case 2 :
                    // 2. 학년별 학생 목록 보기
                    System.out.println("1. 1학년");
                    System.out.println("2. 2학년");
                    System.out.println("3. 3학년");
                    System.out.println("4. 4학년");
                    gradeInt = scr.nextInt();
                    /*grade = gradeInt + "학년";*/


                    break;
                case 3 :
                    // 3. 성적 수정
                    System.out.println("학번을 입력해주세요.");
                    num = scr.nextInt();
                    System.out.println("수정할 점수를 입력해주세요.");
                    score = scr.nextInt();


                    break;

                case 4 :
                    // 4. 학생 정보 삭제
                    System.out.println("학번을 입력해주세요.");
                    num = scr.nextInt();


                    break;

                case 9 :
                    System.out.println("프로그램 종료!");
                    return;
                default :
                    System.out.println("올바른 번호를 입력해주세요.");

            }
        }


    }
}
