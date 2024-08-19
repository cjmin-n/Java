package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.*;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 와일드카드
        * 제네릭 클래스 타입의 객체를 메소드의 매개변수로
        * 받을 때, 그 객체의 타입 변수를 제한할 수 있다.
        *
        * <?> : 제한 없음
        * <? extends Type> : 와일드카드의 상한 제한 (자기자신 포함)
        * <? super Type> : 와일드카드 하한 제한 (자기자신 포함)
        *
        * */

        WildCardFarm wildCardFarm = new WildCardFarm();

        // wildCardFarm.anyType(new RabbitFarm<>(new Reptile()));
        // 1. anyType
        wildCardFarm.anyType(new RabbitFarm<>(new Rabbit())); // 토끼가 울음소리를 냅니다.
        wildCardFarm.anyType(new RabbitFarm<>(new Bunny())); // 바니바니 바니바니 당근당근
        wildCardFarm.anyType(new RabbitFarm<>(new DrunkenBunny())); // 봐니봐니 당당근근 !@$!@

        // 2. extendsType
        // wildCardFarm.extendsType(new RabbitFarm<>(new Rabbit()));
        wildCardFarm.extendsType(new RabbitFarm<>(new Bunny()));
        wildCardFarm.extendsType(new RabbitFarm<>(new DrunkenBunny()));

        // 3. superType
        wildCardFarm.superType(new RabbitFarm<Rabbit>(new Rabbit())); // 타입명시
        wildCardFarm.superType(new RabbitFarm<>(new Bunny()));
        // 타입 명시 : wildCardFarm.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));
        wildCardFarm.superType(new RabbitFarm<>(new DrunkenBunny())); // 타입 명시 하지않고 사용하면 동적바인딩 때문에 제대로 작동함



    }
}
