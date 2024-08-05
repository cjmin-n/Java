package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {

        System.out.println("main() 메소드 호출됨...");

        /*
        * non static method 호출 방법
        * (메소드가 들어있는 클래스명) (사용할 이름) = new (클래스이름());
        * 사용할이름.메소드명();
        * Application01 app1 = new Application01();
        * app1.methodA();
        * */

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        app2.methodC();

        System.out.println("main() 메소드 종료됨...");
        
    }
    
    public void methodA(){
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
    }
    public void methodB(){
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
    public void methodC(){
        System.out.println("methodC() 호출됨");
        System.out.println("methodC() 종료됨");
    }
    
}
