package main.java.com.ohgiraffers.section01.polymorphism;

public class Application02 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        // Animal 클래스가 가지는 메소드를 오버라이딩한 메소드 호출 시
        // 동적 바인딩을 이용할 수 있다.
        for (int i = 0; i < animals.length; i++) {
            animals[i].cry();
            /*
            토끼가 울음소리를 냅니다.
            호랑이가 울부짖습니다.
            토끼가 울음소리를 냅니다.
            호랑이가 울부짖습니다.
            토끼가 울음소리를 냅니다.
            * */
        }

        // 각 클래스 별 고유한 메소드 동작
        for(Animal animal : animals){
            if(animal instanceof Rabbit){
                ((Rabbit)animal).jump();
            }else {
                ((Tiger)animal).bite();
            }
        }
        /*
        토끼가 점프를 합니다.
        호랑이가 물어뜯습니다.
        토끼가 점프를 합니다.
        호랑이가 물어뜯습니다.
        토끼가 점프를 합니다.
        * */



    }
}
