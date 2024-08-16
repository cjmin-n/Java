package main.java.com.ohgiraffers.section01.polymorphism;

public class Application03 {
    public static void main(String[] args) {

        // 다형성을 적용하여 매개변수에 활용

        Animal animal = new Rabbit();
        Animal animal1 = new Tiger();

        Application03 app3 = new Application03();
        app3.feed(animal); // 토끼가 풀을 뜯어 먹습니다.
        app3.feed(animal1); // 호랑이가 고기를 먹습니다.

        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();

        app3.feed(rabbit); // 토끼가 풀을 뜯어 먹습니다.
        app3.feed(tiger); // 호랑이가 고기를 먹습니다.

        app3.feed(new Tiger()); // heap 영역에 만들어서 바로 보낼 수 있음. 밖에서 쓰지는 못함.(메소드 전달용)
        app3.feed(new Rabbit());
    }

    public void feed(Animal animal){
        animal.eat();
    }


}
