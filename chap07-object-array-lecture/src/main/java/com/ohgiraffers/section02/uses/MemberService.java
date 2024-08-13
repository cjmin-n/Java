package main.java.com.ohgiraffers.section02.uses;

public class MemberService { // application 의 명령을 실행할 곳


    public void signUpMembers(){

        Member[] members = new Member[5];

        members[0] = new Member(1, "user01", "pass01", "홍길동", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "유관순", 16, '여');
        members[2] = new Member(3, "user03", "pass03", "이순신", 40, '남');
        members[3] = new Member(4, "user04", "pass04", "신사임당", 36, '여');
        members[4] = new Member(5, "user05", "pass05", "윤봉길", 22, '남');

        /*for (int i = 0; i < members.length; i++) {
            int j = i+1;
            String[] name = {"홍길동", "유관순", "이순신", "신사임당", "윤봉길"};
            int[] age = {20,16,40,36,22};
            char[] gender = {'남','여','남','여','남'};

            members[i] = new Member(j, "user0" + j, "pass0" + j, name[i], age[i], gender[i]);
        }*/


        /* register 에 명령*/
        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);

    }

    public void showAllMembers(){
        MemberFinder memberFinder = new MemberFinder();
        System.out.println("------ 가입된 회원 목록 -------");
        for (Member member : memberFinder.findAllMembers()){
            if(member != null){
                System.out.println(member);
            }
        }
        System.out.println("회원 조회 완료 -------");

    }
}
