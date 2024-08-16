package main.java.com.ohgiraffers.section06.time;

import java.time.*;

public class Application01 {
    public static void main(String[] args) {

        /*
        * time 패키지는 jdk 1.8 에서 추가된 기능이다.
        * Date, Calendar 가 가지고 있는 단점을 해소 하기 위해 탄생했다.
        * time 패키지의 하위 패키지
        *
        * java.time
        *   .chrono : 국제표준에 정의된 달력 시스템을 위한 클래스 제공
        *   .format : 날짜와 시간 파싱과 형식에 대한 클래스 제공
        *   .temporal : 날짜와 시간 필드와 단위 관련 클래스 제공
        *   .zone : 시간대에 관련된 기능 제공
        *
        * 주로 잘 쓰는 클래스는
        * LocalTime, LocalDate, LocalDateTime, ZonedDateTime 들이 있다.
        * */

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow); // 14:58:05.647985300

        LocalTime timeOf = LocalTime.of(18, 30, 0);
        System.out.println("timeOf = " + timeOf); // 18:30


        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow); // 2024-08-16

        LocalDate dateOf = LocalDate.of(2023, 1, 19);
        System.out.println("dateOf = " + dateOf); // 2023-01-19


        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow); // 2024-08-16T15:01:26.839706800

        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeOf = " + dateTimeOf); // 2024-08-16T15:02:55.609518300


        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime); // 2024-08-16T15:03:36.624150600+09:00[Asia/Seoul]

        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf); // zonedDateTimeOf = 2023-01-19T18:30+09:00[Asia/Seoul]




    }
}
