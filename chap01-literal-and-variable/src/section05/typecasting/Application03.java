package section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 계산
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        * */

        int inum = 10;
        long lnum = 10L;

        long result = inum + lnum;
        int result2 = (int)(inum + lnum);
        int result3 = inum + (int)lnum;

        System.out.println(result + result2 + result3);

        byte bnum = 1;
        short snum = 2;

        // short result4 = bnum + snum; 에러. int보다 작은 자료형의 정수의 연산이 일어날 때 기본 자료형인 int로 형변환되어서 short로 들어갈 수 없다.
        short result4 = (short)(bnum + snum);
        System.out.println(result4);

        long lnum3 = 3L;
        long result5 = bnum + lnum3;

    }
}
