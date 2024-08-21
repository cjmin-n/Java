package main.java.com.ohgiraffers.understand1;


import java.util.HashSet;

import java.util.Iterator;
import java.util.Set;

public class StudentManger {

    Set<StudentDTO> studentList = new HashSet<>();
    Iterator<StudentDTO> iterator;

    // 학생 추가 !
    public int add(StudentDTO studentDTO){

        /*for(StudentDTO student : studentList){
            if(student.getNum() == studentDTO.getNum()){
                System.out.println("이미 있는 학번입니다.");
                return false;
            }
        }*/
        iterator = studentList.iterator();
        while(iterator.hasNext()){
            StudentDTO student = iterator.next();
            if(student.getNum() == studentDTO.getNum()){
                System.out.println("이미 있는 학번입니다.");
                return -1;
            }
        }


        studentList.add(studentDTO);

        // System.out.println(studentList.size()); -> 늘어나는거 확인 !
        return 1;

    }

    // 학년별 학생 목록 보기 기능 - 특정 학년 학생목록 조회
    public int list(String grade){

        if(studentList.isEmpty()){
            System.out.println("등록된 학생이 없습니다.");
        } else{

            iterator = studentList.iterator();

            while(iterator.hasNext()){

                StudentDTO student = iterator.next();

                //*System.out.println("student : " + student);*/

                if(grade.equals(student.getGrade())){
                    System.out.println("이름 : " + student.getName() + " | 학번 : " + student.getNum() + " | 성적 : " + student.getScore());
                }

            }
            return 1;


        }
        return -1;

    }
    /*public void list(String grade){

        if(studentList.isEmpty()){
            System.out.println("등록된 학생이 없습니다.");
        } else{

            iterator = studentList.iterator();

            while(iterator.hasNext()){

                StudentDTO student = iterator.next();

                System.out.println("student : " + student);

                if(grade.equals(student.getGrade())){
                    System.out.println("이름 : " + student.getName() + " | 학번 : " + student.getNum() + " | 성적 : " + student.getScore());
                }

            }

            *//*Object[] arr = studentList.toArray();
            for (int i = 0; i < arr.length; i++) {
                *//**//*System.out.println(arr[i]);*//**//*
            }*//*

        }


    }*/




    // 성적 수정 기능 -
    public int modify(int num, int score){

        if(studentList.isEmpty()){
            System.out.println("등록된 학생이 없습니다.");

        }else {
            for(StudentDTO studentDTO : studentList){
                /*System.out.println(studentDTO.getNum() + " " + studentDTO.getScore());
                System.out.println(num + " " + score);*/
                if(num == studentDTO.getNum()){
                    studentDTO.setScore(score);
                    System.out.println(studentDTO.getName() + " 님, 성적 변경 성공 !");
                }
            }
            return 1;
        }
        return -1;
    }

    // 학생 정보 삭제 기능
    public void delete(int num){
        if(studentList.isEmpty()){
            System.out.println("등록된 학생이 없습니다.");
        }else {
            for(StudentDTO studentDTO : studentList){
                if(num != studentDTO.getNum()){
                    System.out.println("일치하는 학생이 없습니다.");
                }
                studentList.remove(studentDTO);
                System.out.println(studentDTO.getName() + " 님이 삭제되었습니다.");
            }

        }
    }
}
