package main.java.com.ohgiraffers.section02;

public class RabbitFarm<T extends Rabbit> { // Rabbit 포함 자손들만 들어올 수 있음 / & interface 상속가능 : public class RabbitFarm<T extends Rabbit & Animal> - extends는 가능 !

    private T animal;

    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
