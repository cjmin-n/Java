package main.java.com.ohgiraffers.understand1;

public class StudentDTO {

    private String name; // 이름
    private int num; // 학번
    private String grade; // 학년
    private int score; // 성적

    public StudentDTO(String name, int num, String grade, int score) {
        this.name = name;
        this.num = num;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", grade='" + grade + '\'' +
                ", score=" + score +
                '}';
    }
}
