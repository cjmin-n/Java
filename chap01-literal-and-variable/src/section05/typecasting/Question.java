package section05.typecasting;

public class Question {
    public static void main(String[] args) {


        /*
        * 5명의 반 학생이 있으며 키는 각각 178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다.
        * 소수자리는 절삭한다.
        * */

        double student1 = 178.5;
        double student2 = 170.3;
        double student3 = 190.7;
        double student4 = 188.67;
        double student5 = 160.8;

        int aver = (int)((student1 + student2 + student3 + student4 + student5) / 5);
        System.out.println("학생의 평균 키는 " + aver + "cm이다.");

        System.out.println("--------------------------------------------");

        long lnum = 10L;
        int num = 190;

        int sum = (int)lnum + num;
        int sum2 = (int)(num + lnum);

        System.out.println(sum + sum2);

        System.out.println("--------------------------------------------");

        /*
        * 사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고싶다.
        *
        * 매출은 다음과 같다.
        * 150400원
        * 1400원
        * 25000원
        * 30000원
        * 총합 = 이번 달 매출
        *
        * 다음과 같이 출력 해주세요
        * 홍길동의 총 매출은 --원 입니다.
        * 부가세 제외 소득은 --원 이고 부가세는 --원입니다.
        *
        * */

        int total = 150400 + 1400 + 25000 + 30000;
        int add = (int)(total * 0.1);
        System.out.println("홍길동의 총 매출은 " + total + "원 입니다. \n부가세 제외 소득은 " + (total-add) + "원이고 부가세는 " + add + "원입니다.");

    }
}
