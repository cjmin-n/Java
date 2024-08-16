import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {

        /*
        * 문제
        총 N개의 문자열로 이루어진 집합 S가 주어진다.
        입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)이 주어진다.
        다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
        다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.
        입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며, 길이는 500을 넘지 않는다. 집합 S에 같은 문자열이 여러 번 주어지는 경우는 없다.
        * */
        Scanner scr = new Scanner(System.in);

        int N = 0;
        int M = 0;

        String[] S = new String[N];

        String a;


        String[] scS = new String[M];
        char c ;

        String b = "가나다";
        for (int i = 0; i < b.length(); i++) {

            c = (char)(b.charAt(i));
            System.out.println(c);
             if (c >= 97 && c<= 122){

            }
        }


        while(true){
            System.out.println("(1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000");
            System.out.println("문자열을 입력해주세요(소문자) 길이는 500을 넘지 않음.");


            // N개의 문자열 S
            for (int i = 0; i < N; i++) {
                System.out.println(S[i]);
                /*S[i] = b;*/
            }

            // M개의 문자열 검사해야하는 문자열
            for (int i = 0; i < M; i++) { // 입력을 M개 받음
                a = scr.nextLine(); // 입력값을 받음
                if(a.length() < 500 ){
                    S[i] = a; // 입력값을 S 배열에 할당.
                }else {
                    System.out.println("길이가 500을 초과했습니다.");
                    break;
                }
            }



            break;



        }













    }
}
