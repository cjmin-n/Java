package main.java.com.ohgiraffers.understand;

public class StudentDTO {

    private String name; // 이름
    private int num; // 학번
    private int score; // 성적

    public StudentDTO(String name, int num, int score) {
        this.name = name;
        this.num = num;
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
                ", score=" + score +
                '}';
    }
}
