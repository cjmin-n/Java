package main.java.com.ohgiraffers.understand;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Application {
    public static void main(String[] args) {


        int saleCount = 0;
        int number = 0;

        HashMap map = new HashMap();


        while(true){
            Scanner scr = new Scanner(System.in);

            System.out.println("----- 로또 프로그램 ----- ");
            System.out.println("로또 몇 장 구매하실 예정입니까? (최대 10개)");
            int num = scr.nextInt();
            saleCount += num;

            if (num > 10){
                System.out.println("10장 이상 구매하실 수 없습니다.");
                continue;
            }

            for (int i = 0; i < num; i++) {

                Set<Integer> lotto = new TreeSet<>();
                // 번호 똑같음 -> for 내부에서 초기화해줘서 해결 !
                while(lotto.size() < 6) {
                    lotto.add( (int)(Math.random() * 45) + 1 );
                }

                 number++;

                // 저장 을 해야함 !..
                if(number < 11){
                    map.put( number + "번 로또", lotto);
                }
            }


            // System.out.println("map : " + map);


            Set<Integer> win = new TreeSet<>();

            // 판매 횟수가 10번 이상일 때 당첨 번호 생성
            if (saleCount > 9){
                while(win.size() < 6) {
                    win.add( (int)(Math.random() * 45) + 1 );
                }
                // System.out.println("win : " + win);

                // 당첨번호랑 비교................
                Collection values = map.values();
                // System.out.println("map.value" + values);
                // Object[] arr = values.toArray();

                for(Object obj : values) {
                    if (obj.equals(win)) {
                        System.out.println("당첨 번호 : " + win);
                        System.out.println(number + "번 로또 당첨 " + map.get(number + "번 로또"));
                    }
                }

                System.out.println("행운 번호 : " + win);
                System.out.println("이번 회차 당첨 없음");
            }


        }


    }
}
