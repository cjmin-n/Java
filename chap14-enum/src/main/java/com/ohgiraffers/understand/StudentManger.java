package main.java.com.ohgiraffers.understand;

import java.util.*;

public class StudentManger {

    private HashMap<Students, ArrayList> hashmap;
    private ArrayList<StudentDTO> studentList;
    Students students;

    public StudentManger(){
        hashmap = new HashMap();
        studentList = new ArrayList<>();
    }


    // 학생 추가 !
    public void add(Students students, StudentDTO studentDTO){

        int num = studentDTO.getNum();
        if(findStudent(num) == -1){
            // 중복되지않았으면
            studentList.add(studentDTO);
            hashmap.put(students, studentList);
            System.out.println("학생이 추가되었습니다");
        }else {
            System.out.println("이미 등록된 학번입니다.");
        }


    }

    // 학년별 학생 목록 보기 기능 - 특정 학년 학생목록 조회
    public void list(Students thisStudents){

        if(hashmap.isEmpty()){
            System.out.println("등록된 학생이 없습니다.");
        }else {
            Iterator<Students> iterator = hashmap.keySet().iterator();
            while(iterator.hasNext()){
                students = iterator.next();

                if(students == thisStudents){
                    studentList = hashmap.get(thisStudents);

                    for(StudentDTO studentDTO : studentList){
                        System.out.println("이름 : " + studentDTO.getName() + "| 학번 : " + studentDTO.getNum()+ " | 점수 : " + studentDTO.getScore());

                    }
                }
            }
        }


    }


    // 성적 수정 기능 -
    public void modify(int num, int score){

        if(hashmap.isEmpty()){
            System.out.println("등록된 학생이 없습니다.");
        }else {
            if(findStudent(num) == num){
               // 학생이 있으면
                for(List<StudentDTO> list : hashmap.values()){

                    for(StudentDTO studentDTO : list){
                        if(studentDTO.getNum() == num){
                            studentDTO.setScore(score);
                            System.out.println("성적이 수정됐습니다.");
                            System.out.println("이름 : " + studentDTO.getName() + "| 학번 : " + studentDTO.getNum()+ " | 점수 : " + studentDTO.getScore());
                        }
                    }
                    /*if(student.getNum() == num) {
                        student.setScore(score);
                        System.out.println("성적이 수정됐습니다.");
                        System.out.println("이름 : " + student.getName() + "| 학번 : " + student.getNum()+ " | 점수 : " + student.getScore());
                    }*/

                }

            }else {
                System.out.println("존재하지 않는 학번입니다.");
            }
        }

    }

    // 학생 정보 삭제 기능
    public void delete(int num){

        if(hashmap.isEmpty()){
            System.out.println("등록된 학생이 없습니다.");
        }else {
            if(findStudent(num) == 1){
                // 학생이 있으면
                for(List<StudentDTO> list : hashmap.values()){

                    for(StudentDTO studentDTO : list){
                        if(studentDTO.getNum() == num){
                            list.remove(num);

                            System.out.println("학생이 삭제되었습니다 !");
                        }
                    }

                    /*if(student.getNum() == num) {
                        *//*for(Students key : hashmap.keySet()){
                            hashmap.get(key).remove(num);
                        }*//*
                        studentList.remove(student);
                        System.out.println(student.getName() + "님이 삭제되었습니다!");
                    }*/

                }


            }else {
                System.out.println("존재하지 않는 학번입니다.");
            }
        }
    }




   // 상수 가져오기
    public Students enumCheck(int grade) {

        Students students = null;
        if(grade == 1){
            students = Students.FRESHMAN;
        }else if(grade == 2){
            students = Students.SOPHOMORE;
        }else if(grade == 3){
            students = Students.JUNIOR;
        }else if(grade == 4){
            students = Students.SENIOR;
        }

        return students;
    }



    // 학번으로 학생 찾기 - 중복 확인
    public int findStudent(int num){

        for(List<StudentDTO> list : hashmap.values()){

            for(StudentDTO student : list){
                //if문 같은지 확인
                if(student.getNum() == num){

                    return num;
                }
            }

        }

        return -1;
    }


}
