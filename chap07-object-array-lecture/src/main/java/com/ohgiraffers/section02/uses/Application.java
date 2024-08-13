package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application { // 프로그램 실행부
    public static void main(String[] args) {

        /*
        * 여러 명의 회원 정보를 한번에 등록
        * 전체 회원 조회 시 여러 명의 회원 정보를 한번에 반환
        *
        * MemberRepository - static 필드로 회원 정보들을 저장 (최대 10명까지)
        *
        * */

        Scanner scr = new Scanner(System.in); // 사용자의 입력을 받기 위함

        MemberService memberService = new MemberService();
        // 객체를 heap 에 생성하여 메소드를 실행할 준비.

        loop:while(true){
            System.out.println("==== 회원 관리 프로그램 ====");
            System.out.println("1. 회원등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = scr.nextInt();

            switch (no){
                case 1 : /*service 에게 내릴 1번 명령*/memberService.signUpMembers(); break;
                case 2 : /*service 에게 내릴 2번 명령*/memberService.showAllMembers(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다."); break loop; // return 보다 반복문 멈추는게 낫다.
                default :
                    System.out.println("잘못된 번호입니다."); break;
            }
        }
    }

    /*
        1(5). Application - 명령 - 스캐너로 받기
        2(2). MemberService - 명령 실행 :
           signUpMembers() -> Member 정보 받음(클래스 배열로) : 한사람당 배열 하나 씩 -> MemberRegister에 명령
           showAllMembers() -> Memberfinder에게 멤버를 받아서 null이 아니면 출력하도록 명령
        3(4). MemberRegister  - 등록 실행
           regist() -> 데이터베이스에서 등록한거를 받아와서 입력만..
        3-2. MemberFinder - 찾기
           -> 멤버 클래스 반환, MemberRepository에서 받아오기.
        4(3). MemberRepository - 데이터베이스 : 몇 명받을지 정해서 그 이하만 등록하도록 - final members
           store()-> Boolean 타입 - true면 등록 / false 면 등록실패 -> if문
           findAllMembers() -> 멤버클래스 반환, 위의 store()에 final members를 받았기 때문에 반환.
        5(1). Member - DTO : 생성자함수, getterSetter, toString


        등록하기
        1. 어떤 값을 받을지 정의 (번호, id, pwd, 이름, 나이, 성별)
        2. 회원정보를 클래스 배열화 해서 넘겨준다. (MemberService)
        3. MemberRegister 에서 멤버 클래스를 받아서
           register() 메소드에 각각의 배열(Member[i])  등록시도합니다. 출력
        4. MemberRepository 에서 상수로 Members[] 개수 정의.
           store()에서 정한 개수보다 크면 등록 안하고 return false;
           정한 개수까지 상수 Members[count]에 전달받은 newMembers[i] 복사. count++
           반복문 다 돌면 return true;
        5. MemberRegister.register() 메소드에  if문으로 MemberRepository.store(members)가 true이면 몇명(members.length 배열개수) 등록되었습니다. 출력
           아니면 등록되지 못했다고 출력
        6. MemberSerivce 에 MemberRegister 의 register() 호출;
        7. Application -> 스캐너로 번호 받아서 switch로 해당번호에 MemberSerivce.signUpMembers(); 호출

        조회하기
        1. MemberRepository.findAllMembers(); return members (정해진 값까지 배열생성)
        2. MemberFinder.findAllMembers() <- MembersRepository 에서 members 반환.
        3. MemberService.showAllMembers() <- MemberFinder.findAllMembers() 반환. (null 이 아닌값만 출력 - 정한 값보다 덜 받았을 경우 기본값 제거하기 위해서)
        4. Applciation - MemberService.showAllMembers() 실행

    */
}
