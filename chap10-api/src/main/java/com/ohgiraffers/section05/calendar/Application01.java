package main.java.com.ohgiraffers.section05.calendar;

import java.util.Date;

public class Application01 {
    public static void main(String[] args) {

        /*
        * Date 클래스
        * jdk 1.0부터 날짜를 취급하기 위해 사용되던 date 클래스는
        * 생성자를 비롯하여 대부분의 메소드가 Deprecated 되었다.
        *
        * Deprecated?
        * 향후 버전이 업데이트 되면서 사라지게 될 기능이니
        * 가급적 사용을 권장하지 않는다는 말이다.
        * 하지만 하위 버전의 호환성 때문에 한번에 제거되는 것은 아니고
        * 남겨두었기 때문에 사용하는 것은 가능하다.
        *
        * jdk 1.1 부터는 calendar 클래스를 이용하여 날짜와 시간을
        * 처리했다. 하지만 calendar 클래스는 몇가지 문제를 가지고 있다.
        * (하지만 아직 많이들 사용하고 있음.)
        *
        * 1. Calendar 인스턴스는 불변객체가 아니기 때문에
        * 값을 수정할 수 있다. -- 유지보수 악영향
        *
        * 2. 윤초를 고려하지 않는다.
        *
        * 3. Calendar 클래스는 월을 0부터 11까지 표현하는 불편함이 있다.
        * */

        Date today = new Date();
        System.out.println(today); // Fri Aug 16 14:28:17 KST 2024

        System.out.println(today.getTime()); // 1723786166651 - 협정세계시부터 현재까지의 시간을 ms로 표현

        Date time = new Date(1723786166651L);
        System.out.println(time); // Fri Aug 16 14:29:26 KST 2024


    }
}
