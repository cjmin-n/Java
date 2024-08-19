package main.java.com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Application02 {
    public static void main(String[] args) {

        /*
        * LinkedHashSet
        * HashSet 이 가지는 기능을 모두 가지고 있고
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        * - 인덱스 접근은 불가
        * */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();

        lhset.add("java");
        lhset.add("mysql");
        lhset.add("jdbc");
        lhset.add("html");
        lhset.add("css");
        System.out.println("lhset = " + lhset); // lhset = [java, mysql, jdbc, html, css]


    }
}
