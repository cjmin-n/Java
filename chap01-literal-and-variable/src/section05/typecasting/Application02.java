package section05.typecasting;

public class Application02 {
    public static void main(String[] args) {
        /*
        * 강제 형변환
        * 바꾸려는 자료형으로 캐스팅 연산자를 이용하여 형변환한다.
        * */

        /*
        자동형변환 규칙과 반대 상황에서 강제 형변환이 필요하다.
        1. 강제 형변환 규칙
            1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환 필요
            1-2. 실수를 정수로 변경 시 강제 형변환 필요
            1-3. 문자형을 int 미만의 크기의 변수에 저장할 때 강제 형변환 필요
            1-4. 논리형은 강제 형변환 규칙에서 제외
        * */

        // 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환

        // 정수간의 강제 형변환
        long lnum = 8L;
//        int inum = lnum; 에러.
        int inum = (int)lnum; // 데이터 손실의 위험 때문에 컴파일러가 에러를 발생시킨다.
        short snum = (short)inum;
        byte bnum = (byte)snum;
        System.out.println(bnum); // 8

        // 실수 간의 강제 형변환
        double dnum = 8.0;
//        float fnum = dnum; 에러.
        float fnum = (float)dnum;

        // 실수를 정수로 변경 시 강제 형변환이 필요
        float fnum2 = 4.123f;
        //long lnum2 = fnum2; 에러.
        long lnum2 = (long)fnum2; // 해당 방식으로 형변환을 하게 되면 소수점 이하의 값은 내림한다.
        System.out.println(lnum2); // 4 - 내림

        // 문자형 int 미만 크기의 변수에 저장할 때는 강제 형변환이 필요하다.
        char ch = 'a';
        int inum2 = ch;
        
        /* 에러. 
        byte bnum2 = ch; 
        short snum2 = ch;*/
        byte bnum2 = (byte)ch;
        short snum2 = (short)ch;
        // long lnum3 = ch; 가능

        // 정수를 문자에 대입 시 강제 형변환이 필요하다.
        char ch3;
        int inum5 = 98;

        // ch3 = inum5; 에러.
        ch3 = 98; // 이건 가능
        ch3 = (char)inum5;
        System.out.println(ch3);

        // boolean 은 제외된다.
    }
}

