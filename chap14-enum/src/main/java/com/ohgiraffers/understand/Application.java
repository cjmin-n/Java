package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        StudentManger studentManger = new StudentManger();

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
                    int gradeInt;

                    System.out.println("이름을 입력해주세요.");
                    String name = scr.nextLine();
                    System.out.println("학번을 입력해주세요. (숫자)");
                    int num = scr.nextInt();
                    scr.nextLine();

                    while(true){
                        System.out.println("학년을 입력해주세요. (숫자)");
                        gradeInt = scr.nextInt();
                        if(gradeInt < 0 || gradeInt > 4){
                            System.out.println("학년은 1~4학년입니다. 다시 선택해주세요.");
                            scr.nextLine();
                            continue;
                        }
                        break;
                    }

                    System.out.println("성적을 입력해주세요. (숫자)");
                    int score = scr.nextInt();

                    Students students = studentManger.enumCheck(gradeInt);

                    studentManger.add(students, new StudentDTO(name, num, score));

                    break;

                case 2 :
                    // 2. 학년별 학생 목록 보기

                    int gradeInt2;
                    while(true){
                        System.out.println("1. 1학년");
                        System.out.println("2. 2학년");
                        System.out.println("3. 3학년");
                        System.out.println("4. 4학년");
                        gradeInt2 = scr.nextInt();
                        if(gradeInt2 < 0 || gradeInt2 > 4){
                            System.out.println("1~4를 선택해주세요.");
                            scr.nextLine();
                            continue;
                        }
                        break;
                    }

                    Students students2 = studentManger.enumCheck(gradeInt2);
                    studentManger.list(students2);

                    break;
                case 3 :
                    // 3. 성적 수정
                    System.out.println("학번을 입력해주세요.");
                    num = scr.nextInt();
                    System.out.println("수정할 점수를 입력해주세요.");
                    score = scr.nextInt();

                    studentManger.modify(num, score);

                    break;

                case 4 :
                    // 4. 학생 정보 삭제
                    System.out.println("학번을 입력해주세요.");
                    num = scr.nextInt();

                    studentManger.delete(num);
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
