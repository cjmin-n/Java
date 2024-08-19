package main.java.com.ohgiraffers.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application03 {
    public static void main(String[] args) {

        /*
        * LinkedList
        * ArrayList 가 배열을 이용해서 발생할 수 있는 성능적인 단점을
        * 보완하고자 고안되었다.
        * 내부는 이중 연결 리스트로 되어 있다.
        *
        * 이중 연결 리스트?
        * : 단일 연결 리스트는 다음 요소만 링크하는 반면
        * 이중 연결 리스트는 이전 요소도 링크하여 이전 요소로 쉽게 접근하기
        * 위해 고안된 자료 구조이다.
        *
        * LinkedList 는 이중 연결 리스트를 구현한 것이며 역시 List 를 상속받아
        * ArrayList 와 사용하는 방법이 유사하다.
        * 하지만 내부적으로 요소를 저장하는 방법에 차이가 있는 것이다.
        * 각 컬렉션 프레임워크 클래스들의 특징을 파악하고
        * 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는 것이 좋다.
        * */

        List<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("orange");
        linkedList.add("mango");
        linkedList.add("grape");

        System.out.println(linkedList); // [apple, banana, orange, mango, grape] - toString 오버라이드

        System.out.println(linkedList.size()); // 5

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(i + " " + linkedList.get(i));
            /*
            0 apple
            1 banana
            2 orange
            3 mango
            4 grape
            * */
        }

        linkedList.remove(1);


        for(String s : linkedList) {
            System.out.println(s);
            /*
            apple
            orange
            mango
            grape
            * */
        }

        linkedList.set(0, "melon");
        for(String s : linkedList) {
            System.out.println(s);
            /*
            melon
            orange
            mango
            grape
            * */
        }




        // 리스트 내 요소 모두 제거
        linkedList.clear();

        System.out.println(linkedList.isEmpty()); // true


        /*
        * ArrayList 와 LinkedList 의 차이
        *
        * ArrayList 의 장점
        * - 내부적으로 배열을 사용하기 때문에 인덱스의 접근이 매우 빠르다.
        * - 메모리 사용량이 적다.
        * ArrayList 의 단점
        * - 중간의 값을 추가하거나 삭제하는데 느린 성능을 가진다.
        * - 배열의 크기를 조절해야 할 때 새로운 배열을 생성하고 기존 요소를 복사한다.
        *
        *
        * LinkedList 의 장점
        * - 중간의 값을 추가하거나 삭제할 때 빠른 성능을 가진다.
        * - 고정된 크기의 배열이 필요하지 않다.
        *
        * LinkedList 의 단점
        * - 느린 인덱스 접근 속도
        * - 더 복잡한 데이터 구조
        * - 더 많은 메모리 사용
        * */

    }
}
