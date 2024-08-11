import java.util.Arrays;
import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {

        /*
         * 배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만든 후,
         * 배열에서 중복된 값을 모두 제거한 후 남은 값을 오름차순으로 출력하는 프로그램을 작성하세요.
         * 만약 배열의 길이가 0이면 "빈 배열입니다."를 출력하세요.
         */

        Scanner scr = new Scanner(System.in);
        int n;

        while(true){
            System.out.println("배열의 길이를 입력해주세요.");
            n = scr.nextInt();

            if (n == 0){
                System.out.println("빈 배열입니다.");
                continue;
            }
            break;
        }

        int num ;
        int[] arr = new int[n];

        System.out.println("배열의 값을 입력해주세요.");
        for (int i = 0; i < n; i++) {
            num = scr.nextInt();
            arr[i] = num;
        }

        // 버블정렬
        /*for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1 -i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }*/
        // 선택정렬
        int min = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = 0; j < n; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] temps = new int[n];
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]){
                temps[j++] = arr[i];
            }
        }

        temps[j++] = arr[n-1];
        for (int i = 0; i < n; i++) {
            System.out.print(temps[i] + " ");
        }
        System.out.println();

        // 배열의 숫자가 배열의 길이보다 작을 때 가능 ! or boolean 배열의 개수를 더 길게 생성해놓을 시 가능
        /*boolean[] isTrue = new boolean[n];

        for (int i = 0; i < n; i++) {
            isTrue[arr[i]] = true;
            if(isTrue[i]){
                System.out.print(i);
            }
        }*/


    }
}
