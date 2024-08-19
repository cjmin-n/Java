package main.java.com.ohgiraffers.section01.list.comparator;

import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {

        int result = 0;

        // 오름 차순
        if(o1.getPrice() > o2.getPrice()){
            result = 1; // 양수가 순서바꿈
        }else if(o1.getPrice() < o2.getPrice()){
            result = -1; // 그대로
        }else {
            result = 0;
        }
        /*
        // 내림차순
        if(o1.getPrice() > o2.getPrice()){
            result = -1;
        }else if(o1.getPrice() < o2.getPrice()){
            result = 1;
        }else {
            result = 0;
        }*/
        return result;
    }
}
