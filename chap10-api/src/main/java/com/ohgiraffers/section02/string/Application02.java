package main.java.com.ohgiraffers.section02.string;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
        *
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str3 == str4); // false

        System.out.println(str1.hashCode()); // 3254818 -> toString(주소값)이 달라도 동등객체여도 해시코드는 같다.
        System.out.println(str2.hashCode()); // 3254818
        System.out.println(str3.hashCode()); // 3254818
        System.out.println(str4.hashCode()); // 3254818

        str2 += "oracle";
        System.out.println(str1 == str2); // false


        /*
        * equals() : String 클래스의 equals() 메소드는
        * 인스턴스 비교가 아닌 문자열 값을 비교하여
        * 동일한 값을 가지는 경우 true, 다른 값인 경우 false
        * 를 반환하도록 override 되어있다.
        * 따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한
        * 문자열인지 비교하기 위해 == 연산 대신
        * equals() 메소드를 사용해야 한다.
        * */

        System.out.println(str1.equals(str3)); // true
        System.out.println(str3.equals(str4)); // true



    }
}
