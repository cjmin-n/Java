package section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
        * 김경리가 4명의 직원의 월급을 입금해줘야 하는 날이다.
        *  각각의 직책은 대리 / 과장 / 차장 / 부장 이며,
        * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
        * 보너스는 각 월급 * 0.5 만큼을 주어야 한다.
        *
        *
        * 화면에 다음과 같이 출력되게 해주세요.
        * ex) 김대리의 월급은 100만원 + 보너스 50만원으로 총 150만원 입금 되었습니다.
        *
        * 4명 다 출력
        * */

        String position = "대리";
        int salary = 100;
//        double bonus = salary * 0.5;
//        int bonus = (int)(salary * 0.5);
        int bonus = salary / 2;
        System.out.println("김" + position + "의 월급은 " + salary + "만원 + 보너스 "+ bonus + "만원으로 총 "+ (salary+bonus) + "만원 입금 되었습니다.");
//        System.out.println("김" + position + "의 월급은 " + salary + "만원 + 보너스 "+ (int)bonus + "만원으로 총 "+ (int)(salary+bonus) + "만원 입금 되었습니다.");

        position = "과장";
        salary += 20;
        bonus = (int)(salary * 0.5);
        System.out.println("김" + position + "의 월급은 " + salary + "만원 + 보너스 "+ bonus + "만원으로 총 "+ (salary+bonus) + "만원 입금 되었습니다.");

        position = "차장";
        salary = 130;
        bonus = (int)(salary * 0.5);
        System.out.println("김" + position + "의 월급은 " + salary + "만원 + 보너스 "+ bonus + "만원으로 총 "+ (salary+bonus) + "만원 입금 되었습니다.");

        position = "부장";
        salary = 150;
        bonus = (int)(salary * 0.5);
        System.out.println("김" + position + "의 월급은 " + salary + "만원 + 보너스 "+ bonus + "만원으로 총 "+ (salary+bonus) + "만원 입금 되었습니다.");

        System.out.println("--------------------------------");

        String[] pos = {"대리", "과장", "차장", "부장"};
        int[] sal = {100, 120, 130, 150};

        for (int i = 0; i < pos.length; i++) {
            int bo = (int)(sal[i] * 0.5);
            System.out.println("김" + pos[i] + "의 월급은 " + sal[i] + "만원 + 보너스 "+ bo + "만원으로 총 "+ (sal[i] + bo) + "만원 입금 되었습니다.");
        }

    }
}
