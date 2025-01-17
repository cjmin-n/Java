package main.java.com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {


        // 클래스가 무엇인지 이해하고 작성할 수 있다.

        // 1. 변수를 이용한 회원 데이터 관리
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"};


        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        for (int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();


        /*
        * 이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
        * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
        * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면 너무 많은 값들을 인자로 전달해야 해서 한 눈에 안들어온다.
        * 3. 리턴값은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.(서로 다른 자료형)
        * */

        /*
        * 클래스명 변수명 = new 클래스명();
        * 지금까지 사용한 이 구문은 객체(instance : 클래스로 만들어진 객체)를 생성하는 구문이다.
        * 사용자 정의의 자료형인 클래스를 이용하기 위해서는 new 연산자로 heap 영역에 할당을 해야한다.
        * 객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체가 생성된다.
        * 아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서 사용하도록 heap 에 공간을 만들었다.
        * */

        Member member = new Member();

        /*
        * 필드에 접근하기 위해서는 레퍼런스변수명.필드명() 으로 접근한다.
        * '.' 은 참조연산자라고 하는데, 레퍼런스 변수가 참조하고 이는 주소로 접근한다는 의미를 가진다.
        * 각 공간은 필드명으로 접근한다.
        * 클래스-역할 / 객체-구현
        * */

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"축구", "볼링", "테니스"};
        System.out.println("----------------------");
        System.out.println("member.id = " + member.id);
        System.out.println("member.pwd = " + member.pwd);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);
        for (int i = 0; i < member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }
        System.out.println();

    }
}
