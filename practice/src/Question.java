import java.util.Arrays;
import java.util.Scanner;

public class Question {
    public static void main(String[] args){
        /*
         *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
         *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. // (잘하면 두번째로 큰 값도)
         *  만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번쨰로 큰 수를 찾을 수 없습니다." 출력
         * */
        Scanner scr = new Scanner(System.in);
        int n;

        while(true){
            System.out.println("배열의 길이를 입력해주세요.");
            n = scr.nextInt();

            if(n<=1){
                System.out.println("1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없습니다.");
                continue;
            }
            break;

        }

        int num;
        int[] arr = new int[n];


        System.out.println("배열의 숫자를 입력해주세요.");
        for (int i = 0; i < n; i++) {
            num = scr.nextInt();
            arr[i] = num;
        }

        int max = arr[0];
        int maxSecond = arr[0];
        for (int i = 1; i < n; i++) {
            if(max < arr[i]){
                max = arr[i];
                maxSecond = max;
            } else if (maxSecond < arr[i] || max == maxSecond) {
                maxSecond = arr[i];
            }
        }

        if (max == maxSecond){
            System.out.println("두번째로 큰 값을 찾을 수 없습니다.");
            return;
        }

        System.out.println(max + " " + maxSecond + " " + Arrays.toString(arr));






    }
}
