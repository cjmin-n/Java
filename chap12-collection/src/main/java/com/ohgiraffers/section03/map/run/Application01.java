package main.java.com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Map
        * Collection 인터페이스와는 다른 저장 방식을 가진다.
        * 키와 값을 한 쌍으로 저장하는 방식을 사용한다.
        * 인덱스 대신에 키 사용
        *
        * 키(key)?
        * : 값을 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장 순서를 유지하지 않는다.
        * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복 값은 저장 가능하다.
        *
        * HashMap, HashTable, TreeMap 등의 대표적인 클래스가 있지만,
        * HashMap 이 제일 많이 사용된다.
        *
        * // 해시 알고리즘을 사용하여 검색 속도가 빠르다.
        * */

        HashMap hmap = new HashMap();

        hmap.put("one", new Date()); // 키와 값은 인스턴스만 가능 !
        hmap.put(2, "redApple"); // -> new Integer(2)로 오토박싱 되고 있는 것이다.
        hmap.put(3.3, 123);

        System.out.println(hmap); // {2=redApple, one=Mon Aug 19 15:46:30 KST 2024, 3.3=123}


        hmap.put(2, "yellow"); // 키는 덮어쓴다.
        System.out.println(hmap); // {2=yellow, one=Mon Aug 19 15:48:14 KST 2024, 3.3=123}

        hmap.put(3, "yellow"); // 값은 중복 가능
        System.out.println(hmap); // {2=yellow, 3=yellow, one=Mon Aug 19 15:49:42 KST 2024, 3.3=123}


        // 값을 가져올 때 - .get(key) : value
        System.out.println("키 3에 대한 값 : " + hmap.get(3)); // 키 3에 대한 값 : yellow


        // 키 값 삭제 처리 remove() : remove(key)
        hmap.remove(3);
        System.out.println(hmap); // {2=yellow, one=Mon Aug 19 15:53:41 KST 2024, 3.3=123}

        System.out.println(hmap.size()); // 3



        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java17");
        hmap2.put("two", "mysql");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html5");
        hmap2.put("five", "css3");

        // keySet() 이용해서 키만 따로 set 으로 만들고, iterator()로
        // 키에 대한 목록을 만든다.
        Iterator<String> keyIter = hmap2.keySet().iterator();

        while(keyIter.hasNext()){
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " : " + value);
            /*
            four : html5
            one : java17
            two : mysql
            three : jdbc
            five : css3
            * */
        }



        // value 만 꺼내서 컬렉션에 담기
        // 1. 반복자 Iterator로 처리
        Collection<String> values = hmap2.values();

        Iterator<String> valueIter = values.iterator();
        while(valueIter.hasNext()){
            System.out.println(valueIter.next());
            /*
            html5
            java17
            mysql
            jdbc
            css3
            * */
        }

        // 2. toArray() 로 처리
        Object[] valueArr = values.toArray();
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println(i + " : " + valueArr[i]);
            /*
            0 : html5
            1 : java17
            2 : mysql
            3 : jdbc
            4 : css3
            * */
        }



        // Map의 내부에 존재하는 EntrySet 을 이용
        Set<Map.Entry<String, String>> set = hmap2.entrySet();

        Iterator<Map.Entry<String, String>> entryIter = set.iterator();
        while(entryIter.hasNext()){
            Map.Entry<String, String> entry = entryIter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
            /*
            four : html5
            one : java17
            two : mysql
            three : jdbc
            five : css3
            * */
        }


    }
}
