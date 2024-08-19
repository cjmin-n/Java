package main.java.com.ohgiraffers.section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 같은 요소의 중복 저장을 허용하지 않는다.
        *
        * - 장점 : 고유성 보장, 효율적인 데이터 테스트, 수학적 집합 연산 가능
        *           list 에서 중복 제거 가능
        *
        * */

        /*
        * HashSet
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다.
        * 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        *
        * */

        HashSet<String> hset = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("jdbc"));
        hset.add(new String("mysql"));
        hset.add(new String("css"));
        hset.add("java");

        System.out.println(hset); // [css, java, jdbc, mysql] - 값을 기준으로 중복저장이 되지 않음


        System.out.println(hset.size()); // 4

        System.out.println(hset.contains("java")); // true
        System.out.println(hset.contains(new String("java"))); // true - 동등객체는 같은 해시코드가 되도록 오버라이드 되어있음


        // 1. toArray() 이용해 배열로 바꿈
        Object[] arr = hset.toArray(); // toArray의 반환타입이 Object 배열
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
            /*
            0 css
            1 java
            2 jdbc
            3 mysql
            * */
        }

        // 2. iterator() 로 목록을 만든다.
        Iterator<String> iter = hset.iterator(); // hset을 iterator로 변환

        while(iter.hasNext()){ // 다음것이 존재할 때까지 반복
            System.out.println(iter.next()); // 반환 후 삭제 !
            /*
            css
            java
            jdbc
            mysql
            * */
        }

        System.out.println(iter.hasNext()); // false

        System.out.println(hset); // [css, java, jdbc, mysql] - 손상 없음

        hset.clear();
        System.out.println(hset.isEmpty()); // true



    }
}
