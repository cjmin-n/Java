package main.java.com.ohgiraffers.section01.list.run;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class Application05 {
    public static void main(String[] args) {

        /*
        * Queue
        * Queue 는 선형 메모리 공간에 데이터를 저장하는
        * 선입선출(FIFO) 방식의 자료구조이다.
        * Queue 인터페이스를 상속 받은 하위 인터페이스 들은
        * Deque, BlockingQueue, TransferQueue 등 다양하지만
        * 대부분 큐는 LinkedList 를 이용한다.
        * ex. 수강신청, 티켓팅
        * */

        // Queue 자체는 인터페이스
        // Queue<String> que = new Queue(); 에러.

        Queue<String> que = new LinkedList<>(); // 가장 대중적인 방식

        que.offer("first");
        que.offer("second");
        que.offer("third");
        que.offer("fourth");
        que.offer("fifth");

        System.out.println(que); // [first, second, third, fourth, fifth]

        /*
        * peek() : 해당 큐의 가장 앞에 있는 요소 반환
        * poll() : 해당 큐의 가장 앞에 있는 요소 반환 후 제거
        * */

        System.out.println("peek() : " + que.peek()); // peek() : first
        System.out.println("peek() : " + que.peek()); // peek() : first
        System.out.println(que); // [first, second, third, fourth, fifth]

        System.out.println("poll() : " + que.poll()); // poll() : first
        System.out.println("poll() : " + que.poll()); // poll() : second
        System.out.println("poll() : " + que.poll()); // poll() : third
        System.out.println("poll() : " + que.poll()); // poll() : fourth
        System.out.println("poll() : " + que.poll()); // poll() : fifth
        System.out.println("poll() : " + que.poll()); // poll() : null - 에러 안남
        System.out.println(que); // []


    }
}
