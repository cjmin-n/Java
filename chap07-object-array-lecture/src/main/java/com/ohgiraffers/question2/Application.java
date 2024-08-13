package main.java.com.ohgiraffers.question2;

public class Application {
    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        // 3명의 직원의 연봉 평균을 구하여 출력

        EmployeeDTO[] emp = new EmployeeDTO[3];
        emp[0] = new EmployeeDTO();
        emp[1] = new EmployeeDTO(1, "홍길동", null, null, 19, 'M', 0, 0.0, "010222233333", "서울 잠실");
        emp[2] = new EmployeeDTO(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i] + " : " + emp[i].information());
        }
        emp[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        emp[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장", 19, 'M', 4000000, 0.3, "01022223333", "서울 잠실");

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i] + " : " + emp[i].information());
        }

        int[] salary = new int[emp.length];
        int total = 0;

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getEmpName() + "의 연봉 : " + (int)(emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12 + "원");
            salary[i] = (int)(emp[i].getSalary() + emp[i].getSalary() * emp[i].getBonusPoint()) * 12;
            int num = salary[i];
            total += num;
        }

        System.out.println("직원들의 연봉의 평균 : " + total / emp.length + "원");
    }
}
