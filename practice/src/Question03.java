import java.util.Scanner;

public class Question03 {
    static int num = 19;

    public static void main(String[] args) {
        /*
         *  19 * 19 크기의 바둑판을 생성
         *  사용자로부터 입력을 받아 번갈아 바둑돌을 놓는 간단한 게임 구현
         * */

        char[][] baduk = new char[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                baduk[i][j] = '.';
            }
        }

        Question03 que = new Question03();
        que.print(baduk);

        Scanner scr = new Scanner(System.in);
        char currentPlayer = '●';
        int num1 = 0;
        int num2 = 0;

        boolean isTrue = true;
        
        while(isTrue){
            System.out.println("행을 입력하세요 (1~19)");
            num1 = scr.nextInt();
            System.out.println("열을 입력하세요 (1~19)");
            num2 = scr.nextInt();

            if(num1 >=1 && num1 <= num && num2 >=1 && num2 <=num && baduk[num1-1][num2-1] == '.'){
                baduk[num1-1][num2-1] = currentPlayer;

                if(currentPlayer == '●'){
                    currentPlayer = '○';
                }else {
                    currentPlayer = '●';
                }
            }else {
                System.out.println("잘못된 위치입니다.");
                continue;
            }
            que.print(baduk);

        }
        System.out.println("밖");
        que.print(baduk);
        /*for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                if(baduk[i][j] != '.'){
                    isTrue = false;
                    System.out.println("끝");
                }
            }
        }*/




    }

    public void print(char[][] board){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
