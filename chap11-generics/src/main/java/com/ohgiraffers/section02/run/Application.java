package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.*;

public class Application {
    public static void main(String[] args) {

         /*
         * 제네릭 클래스 작성 시 extends 키워드를 사용하면
         * 특정 타입만 사용하도록 제한을 걸 수 있다.
         * */

        // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
        // RabbitFarm<Mammal> farm2 = new RabbitFarm<Mammal>();
        // RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();


        // farm4.setAnimal(new Rabbit());
        farm4.setAnimal(new DrunkenBunny()); // 자식을 넣어줄 때 형변환 해주지 않아도 된다.
        farm4.getAnimal().cry(); // 토끼가 울음소리를 냅니다.

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry(); // 바니바니 바니바니 당근당근

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry(); // 봐니봐니 당당근근 !@$!@


    }
}
