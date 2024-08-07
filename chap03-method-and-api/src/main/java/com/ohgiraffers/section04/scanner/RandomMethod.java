package main.java.com.ohgiraffers.section04.scanner;

public class RandomMethod {

    // non-static
    public void randomM (int a){

        if ( (a > 0) && ((a % 2) == 0) ){
            System.out.println("매개변수가 양수면서 짝수입니다.");
        } else if ( (a > 0) && ((a % 2) != 0) ) {
            System.out.println("매개변수가 양수면서 홀수입니다.");
        } else if ( (a < 0) && ((a % 2) == 0) ) {
            System.out.println("매개변수가 음수면서 짝수입니다.");
        } else if ( (a < 0) && ((a % 2) != 0) ) {
            System.out.println("매개변수가 음수면서 홀수입니다.");
        }
    }

    // static
    public static void randomM2 (int a) {

        String result = a > 0 ? (a % 2) == 0 ? "매개변수는 양수면서 짝수입니다" : "매개변수는 양수면서 홀수입니다" : (a % 2) != 0 ? "매개변수는 음수면서 홀수입니다" : "매개변수는 음수면서 짝수입니다";
        System.out.println(result);
    }

}
