package main.java.com.ohgiraffers.understand2.dto;

public class MemberDTO {

    private String id;
    private String pwd;

    public MemberDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
