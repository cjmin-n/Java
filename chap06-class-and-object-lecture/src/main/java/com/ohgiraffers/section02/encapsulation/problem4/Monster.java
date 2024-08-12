package main.java.com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /*
     * 접근제어자 (접근제한자)
     * 클래스 혹은 클래스의 멤버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드
     * 1. public : 모든 패키지 접근 허용
     * 2. protected : 동일 패키지에 접근 허용
     * 단, 상속관계에 있는 경우 다른 패키지에서도 접근 할 수 있음.
     * 3. default : 동일 패키지에서만 접근 허용
     * 4. private : 해당 클래스 내부에서만 접근 허용
     *
     * 위의 네 가지 접근제어자는 클래스의 멤버(필드, 메소드) 모두 사용 가능하다.
     * 단, 클래스 선언 시 사용하는 접근제어자는 public 과 default 만 가능하다.
     *
     * */

    private String kind;
    private int hp;

    public void setKind(String kind){
        this.kind = kind;
    }

    public void setHp(int hp){
        if(hp > 0){
            this.hp = hp;
        } else {
            this.hp = 0;
        }
    }

    public String getInfo(){
        return "몬스터 종류는 " + this.kind + " 이고, 체력은 " + this.hp + " 입니다.";
    }
}
