package main.java.com.ohgiraffers.section04.use2;

public class Dicer {

    private int currentPosition;

    public void move(int diceNumber){
        this.currentPosition += diceNumber;
    }

    public void throwDice(Dice dice){
        int diceNumber = dice.getNumber();
        move(diceNumber);
        System.out.println("현재 위치는 " + currentPosition + " 입니다.");
    }
}
