package section04.overflow;

public class Application01 {
    public static void main(String[] args) {


        // 자료형 별 최대 범위를 벗어나는 경우 - 적재적소에 맞는 자료형 사용해야 한다. overflow / underflow 발생됨.

        /*
        * 1byte 는 8개의 bit를 가지고 있음.
        * 127을 2진수로 변환하면 01111111
        * -128은 2진수로 변환하면 10000000
        *
        * */

        byte num1 = 127;
        System.out.println("num1 : " + num1); // 127
        num1++;
        System.out.println("num1 : " + num1); // -128

        // 언더 플로우
        // 오버플로우와 반대되는 개념

        byte num2 = -128;
        System.out.println("num2 : " + num2); // -128
        num2--;
        System.out.println("num2 : " + num2); // 127


        int firstNum = 10000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println(multi);

        long multi2 = (long)firstNum * secondNum;
        System.out.println(multi2);

    }
}
