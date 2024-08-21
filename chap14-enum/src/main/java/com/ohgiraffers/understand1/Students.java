package main.java.com.ohgiraffers.understand1;

public enum Students {

    FRESHMAN("1학년"),
    SOPHOMORE("2학년"),
    JUNIOR("3학년"),
    SENIOR("4학년");

    private final String description;

    Students(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }


}
