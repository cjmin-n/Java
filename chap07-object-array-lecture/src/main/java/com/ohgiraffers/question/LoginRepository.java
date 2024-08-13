package main.java.com.ohgiraffers.question;

public class LoginRepository {

    // private static final User[] user = new User[10];
    private static final User[] user = new User[2];
    private static int count;


    public boolean signUp(User newUser){

        if(count >= user.length){
            System.out.println("가입인원을 초과했습니다.");
            return false;
        }

        user[count] = newUser;
        count++;

        return true;
    }


    public boolean login(User newUser){
       /* if(count == 0){
            System.out.println("가입한 회원이 없습니다.");
        }*/
        for (int i = 0; i < user.length; i++) {
            if(user[i].getId() == newUser.getId() && user[i].getPwd() == newUser.getPwd()){
            }

        return true;
    }


}
