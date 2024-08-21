package main.java.com.ohgiraffers.understand1;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        StudentManger studentManger = new StudentManger();
        StudentDTO studentDTO;
        EnumSet<Students> students = EnumSet.allOf(Students.class);
        Iterator<Students> iter = students.iterator();

        String name; // 이름
        int num; // 학번
        String grade; // 학년
        int score; // 성적

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
                    name = scr.nextLine();
                    System.out.println("학번을 입력해주세요. (숫자만 입력)");
                    num = scr.nextInt();
                    scr.nextLine();
                    System.out.println("학년을 입력해주세요. (숫자 1 ~ 4 입력)");
                    int gradeInt = scr.nextInt();
                    /*if(gradeInt < 0 || gradeInt > 4){
                        System.out.println("1~4를 입력해주세요.");
                        continue;
                    }*/
                    System.out.println("성적을 입력해주세요. (숫자만 입력)");
                    score = scr.nextInt();

                    grade = gradeInt + "학년";
                    while(iter.hasNext()){
                        if(iter.next().toString() == grade){
                            grade = iter.next().getDescription();
                        }
                    }

                    studentDTO = new StudentDTO(name, num, grade, score);

                    if(studentManger.add(studentDTO) == 1){
                        System.out.println(name + "님 추가 성공 !");
                    }

                    break;

                case 2 :
                    // 2. 학년별 학생 목록 보기
                    System.out.println("1. 1학년");
                    System.out.println("2. 2학년");
                    System.out.println("3. 3학년");
                    System.out.println("4. 4학년");
                    int gradeInt2 = scr.nextInt();

                    /*studentManger.list(gradeInt2);*/
                    grade = gradeInt2 + "학년";
                    // studentManger.list(grade);

                   if(studentManger.list(grade) == -1){
                        System.out.println("해당 학년이 없습니다.");
                    }

                    break;
                case 3 :
                    // 3. 성적 수정
                    System.out.println("학번을 입력해주세요.");
                    num = scr.nextInt();
                    System.out.println("수정할 점수를 입력해주세요.");
                    score = scr.nextInt();

                    int modify = studentManger.modify(num, score);
                    if(modify == -1){
                        System.out.println("해당 학생이 없습니다.");
                    }

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
                    continue;
            }
        }


    }
}
