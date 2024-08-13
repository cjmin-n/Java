package main.java.com.ohgiraffers.section02.uses;

public class MemberRepository { // 데이터베이스 대용. 실제 데이터 수행부

    private final static Member[] members = new Member[10];

    private static int count;

    public static boolean store(Member[] newMembers){
        for (int i = 0; i < newMembers.length; i++) {
            if(count != 10){
                members[count] = newMembers[i];
                count++;
            }else {
                System.out.println("정원 초과");
                return false;
            }
        }
        return true;
    }


    public static Member[] findAllMembers(){
        return members;
    }

}
