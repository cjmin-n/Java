package main.java.com.ohgiraffers.section02;

public class WildCardFarm {

    // 매개변수로 전달 받는 토끼농장을 구현할 때 사용할 타입 변수에 대해 제한할 수 있다.

    public void anyType(RabbitFarm<?> farm){ // ? 가 와일드카드 
        farm.getAnimal().cry();
    }
    public void extendsType(RabbitFarm<? extends Bunny> farm){ // 메소드마다 추가 제한 가능
        farm.getAnimal().cry();
    }
    
    public void superType(RabbitFarm<? super Bunny> farm){ // 자신 포함 부모
        farm.getAnimal().cry();
    }

}
