package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        // 필드에 직접 접근하는 경우 생기는 문제점 (2)

        /*Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "프랑켄";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "미라";
        monster3.hp = 400;

        System.out.println("monster1.name = " + monster1.name);
        System.out.println("monster2.name = " + monster2.name);
        System.out.println("monster3.name = " + monster3.name);*/

        // 변수가 변경되었을 때 사용하는 클래스에서는 오류가 뜸 - 결합도가 높기 때문에 유지보수에 악영향을 준다.


    }
}
