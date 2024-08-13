package main.java.com.ohgiraffers.section08.singleton;

public class Application {
    public static void main(String[] args){

        /*
        * singleton pattern 이란?
        * 애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만
        * 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
        * 하나의 인스턴스를 공유해서 사용하며
        * 메모리 낭비를 방지할 수 있게 함. (매번 인스턴스 생성 x)
        *
        * 장점
        * 1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만,
        *   두 번째 이용시에는 인스턴스 생성 시간 없이 사용할 수 있다.
        * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보장할 수 있다.
        *
        * 단점
        * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면
        * 결합도가 높아진다. (유지보수에 문제)
        * 2. 동시성 문제를 고려해서 설계해야 하기 때문에 난이도가 있다.
        *
        * 싱글톤 구현 방법
        * 1. 이른 초기화
        * 2. 게으른 초기화
        * */

        // 이른 초기화 : 이미 프로그램이 실행될 때 static으로 만들어진 인스턴스를 가져다 쓰는 것
        // EagerSingleton eager1 = new EagerSingleton(); // 에러 - private 으로 외부접근 차단

        // EagerSingleton 클래스에서 생성자함수를 만들어 private 접근제어자를 사용해서 접근을 막아놓음
        // 호출 시에 새로 추가하는 것이 아니라 return 으로 생성자 함수를 반환하는 getInstance() 라는 메소드를 활용해서 호출

        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("eager1.hashCode() = " + eager1.hashCode()); // 295530567
        System.out.println("eager2.hashCode() = " + eager2.hashCode()); // 295530567
        // 결과적으로 다른 변수여도 해시코드가 같음 - 생성자 함수가 하나이기 때문에 !


        // 게으른 초기화 - 메소드에서 생성자 함수 호출 (if문을 통해서 null 일 경우에만 최초 생성)
        LazySingleton lazy1 = LazySingleton.getInstance();
        /*
            lazy 가 null
            lazy 생성됨
            lazy 가 null 이 아님
        * */
        LazySingleton lazy2 = LazySingleton.getInstance(); // lazy 가 null 이 아님

        System.out.println("lazy1.hashCode() = " + lazy1.hashCode()); // 1480010240
        System.out.println("lazy2.hashCode() = " + lazy2.hashCode()); // 1480010240




        /*
        * static
        * 정적 메모리 영역에 프로그램이 시작될 때 할당하는 키워드이다.
        * 인스턴스를 생성하지 않고도 사용할 클래스의 멤버에 지정할 수 있다.
        * 여러 인스턴스가 공유해서 사용할 목적의 공간이다.
        * 하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야 할 방식이다.
        * 명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하는 게 좋다.
        * 의도적으로 static 키워드를 사용하는 대표적인 예는 singleton 객체를 생성할 때 이다.
        *
        * */
    }
}
