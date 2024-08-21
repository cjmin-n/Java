package main.java.com.ohgiraffers.understand;

import java.util.HashMap;
import java.util.Map;

public class StudentManger {

    Map<Students, StudentDTO> hashmap = new HashMap();


    // 학생 추가 !
    public void add(Students students, StudentDTO studentDTO){
        hashmap.put(students, studentDTO);
    }

    // 학년별 학생 목록 보기 기능 - 특정 학년 학생목록 조회
    public void list(String grade){

    }


    // 성적 수정 기능 -
    public void modify(int num, int score){

    }

    // 학생 정보 삭제 기능
    public void delete(int num){

    }
}
