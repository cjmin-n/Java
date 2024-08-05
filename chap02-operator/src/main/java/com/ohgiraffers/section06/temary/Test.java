package main.java.com.ohgiraffers.section06.temary;

public class Test {
    public static void main(String[] args) {

        int student1 = 90;
        int student2 = 95;
        int student3 = 81;

        int aver = (student1+student2+student3)/3;
        String pass = ((student1 >= 90) && (student1 <= 100)) ? "합격이다." : "불합격이다.";

        System.out.println("1번 : 평균 " + aver); // 88 (내림)
        System.out.println("1번 : 학생 1은 " + pass);

        pass = ((student2 >= 90) && (student2 <= 100)) ? "합격이다." : "불합격이다.";
        System.out.println("1번 : 학생 2은 " + pass);

        pass = ((student3 >= 90) && (student3 <= 100)) ? "합격이다." : "불합격이다.";
        System.out.println("1번 : 학생 3은 " + pass);

        int a = 130;
        String possible = (a >= 120) ? "탑승 가능하다." : "탑승 불가능하다.";
        System.out.println("2번 : 탑승 가능 코드 : a는 " + possible);
    }
}
