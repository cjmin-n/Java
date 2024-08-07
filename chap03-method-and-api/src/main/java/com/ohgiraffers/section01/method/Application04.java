package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {

        // 여러 개의 전달인자를 이용한 메소드 호출 테스트
        Application04 app4 = new Application04();
        app4.testMethod("홍길동", 20, '남');

        int a = app4.test();
        System.out.println(a); // 1
    }

    // 문서화 주석 - 메소드를 호출 할 때 우리가 작성한대로 가이드를 볼 수 있음.
    // 가이드를 보고 내가 만든 메소드를 어떻게 사용하는지 알 수 있다. - 협업에 필요
    /**
     * 이름과 나이와 성별을 전달 받아 한 번에 출력해주는 기능을 제공
     * @param name 출력할 이름을 전달 해주세요.
     * @param age 출력할 나이를 전달 해 주세요.
     * @param gender 출력할 성별을 전달 해 주세요. 성별은 변경되지 않습니다.
     * */

    public void testMethod(String name, int age, final char gender){
        /*
        * name = "유관순";
        * age = 30;
        * gender = '여'; // 에러 - 상수이기 때문에 재정의 불가
        * */
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }

    public int test(){
        return 1;
    }
}
