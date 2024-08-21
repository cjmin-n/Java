package main.java.com.ohgiraffers.section03.uses;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {


        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin); // ADMIN
        System.out.println(admin.getNameToLowerCase()); // admin

        UserRole2 consumer = UserRole2.CONSUMER;
        System.out.println(consumer.name() + " " + consumer.getDescription()); // CONSUMER 구매자
        System.out.println(consumer + " " + consumer.getDescription()); // CONSUMER 구매자
        // 해당 이름(name()은 만들지 않아도 가능) 외에 특정 속성도 같이 갖게 할 수 있다.


        // 인스턴스는 싱글톤으로 관리되기 때문에 동일비교 연산이 가능하다.
        System.out.println(consumer == UserRole2.CONSUMER); // true

        System.out.println("=============================");

        // EnumSet 을 활용하여 여러 열거형 타입들을 set 으로 취급할 수 있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class); // UserRoles 안에 있는 모든 클래스들을 EnumSet에 넣는다.
        Iterator<UserRole2> iter = roles.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().name());

            /*
            GUEST
            CONSUMER
            PRODUCER
            ADMIN
            * */
        }


        // 특정 타입만 골라서 Set 에 추가할 수 있다.
        EnumSet<UserRole2> users = EnumSet.of(UserRole2.CONSUMER, UserRole2.PRODUCER); // of 뒤에 작성하는 특정 타입만 추가
        Iterator<UserRole2> userIter = users.iterator();
        while(userIter.hasNext()){
            UserRole2 role = userIter.next();
            System.out.println(role.name() + " " + role.getDescription());
            /*
            CONSUMER 구매자
            PRODUCER 판매자
            * */
        }


    }
}
