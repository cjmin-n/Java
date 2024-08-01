package section01.literal;

public class Application01 {
    public static void main(String[] args){
        System.out.println("hello world");

        /*
         * 여러 가지 값의 형태를 출력할 수 있다.
        */

        // 1. 숫자 형태의 값 //sout enter
        System.out.println(123); // 정수형 리터럴
        System.out.println(1.23); // 실수형 리터럴

        // 2. 문자 형태의 값 출력
        System.out.println('a'); // 문자형 리터럴
        // System.out.println('ab'); 두 개 이상의 문자는 문자열로 취급
        System.out.println('1');
        
        // 3. 문자열 형태의 값 출력
        System.out.println("안녕하세요"); //문자열(문자 배열)

        // 4. 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);

    }
}
