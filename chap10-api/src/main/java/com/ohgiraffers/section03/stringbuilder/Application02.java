package main.java.com.ohgiraffers.section03.stringbuilder;

public class Application02 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();

        // capactiy() : 용량을 정수형으로 반환하는 메소드
        System.out.println(sb1.capacity()); // 16 : StringBuilder 기본용량

        /*
        * append() : 인자로 전달된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다.
        * 기본 용량을 초과하는 경우 (기존 문자열 + 1) * 2 를 하여 용량을 확장시킨다.
        *
        *
        * */
        for (int i = 0; i < 50; i++) {
            sb1.append(i);

            System.out.println("sb1 = " + sb1);
            System.out.println("capacity() : " + sb1.capacity());
            System.out.println("hashCode() : " + sb1.hashCode());
        }

        /* 필기. 새로운 StringBuilder 인스턴스 생성 */
        StringBuilder sb2 = new StringBuilder("javaoracle");

        /* 필기.
         *  delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부문의 문자열을 제거한다.
         *  deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거한다.
         *  둘 다 원본에 영향을 미친다.
         *  */
        System.out.println("delete() : " + sb2.delete(2, 5));            //jaracle
        System.out.println("deleteCharAt() : " + sb2.deleteCharAt(0));      //aracle

        System.out.println("sb2 : " + sb2);                           //aracle

        /* 필기.
         *  insert() : 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
         *  원본에 영향을 미친다.
         * */
        System.out.println("insert() : " + sb2.insert(1, "vao")); // insert() : avaoracle
        System.out.println("insert() : " + sb2.insert(0, "j")); // insert() : javaoracle
        /* 인덱스 번호가 문자열의 길이와 같은 경우 append()와 같은 역할을 한다. */
        System.out.println("insert() : " + sb2.insert(sb2.length(), "jdbc")); // insert() : javaoraclejdbc

        System.out.println("sb2 : " + sb2); // sb2 : javaoraclejdbc

        /* 필기.
         *  reverse() :  문자열 인덱스 순번을 역순으로 재배열한다.
         *  원본에 영향을 미친다.
         * */
        System.out.println("reverse() : " + sb2.reverse());  // reverse() : cbdjelcaroavaj
        System.out.println("sb2 : " + sb2); // sb2 : cbdjelcaroavaj

        /* 필기.
         *  String 클래스와 동일한 메소드도 있다.
         *  charAt(), indexOf()/lastIndexOf(), length(), replace(), substring(), toString()
         * */

    }
}
