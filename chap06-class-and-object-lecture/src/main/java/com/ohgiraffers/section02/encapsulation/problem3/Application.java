package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args){

        // 필드에 직접 접근 시 생기는 문제점 (3) - 결합도가 낮은 방식

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100); // 정상적으로 체력이 입력 되었습니다.

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄");
        monster2.setHp(200); // 정상적으로 체력이 입력 되었습니다.

        System.out.println(monster1.getInfo()); // 몬스터는 드라큘라 이고, 체력은 100 입니다.
        System.out.println(monster2.getInfo()); // 몬스터는 프랑켄 이고, 체력은 200 입니다.

        // 여전히 필드에 접근이 가능하다는 것이 마지막 문제점이다 !
        Monster monster3 = new Monster();
        monster3.kind = "두치";
        monster3.hp = -500;

        System.out.println("monster3.kind = " + monster3.kind);
        System.out.println("monster3.hp = " + monster3.hp);
    }
}
