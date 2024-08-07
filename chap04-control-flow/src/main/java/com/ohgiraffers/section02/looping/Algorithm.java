package main.java.com.ohgiraffers.section02.looping;

import java.util.Arrays;
import java.io.*;
import java.util.Scanner;

public class Algorithm {
    // 1
    static boolean[] isPrime;

    static void isPrime_fun(int n){
        isPrime = new boolean[n+1]; // N번째 수까지 받기 위해 N+1까지 동적할당

        for(int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true; // boolean 배열의 default 값은 false이므로 true로 바꿔주기
        }

        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아니니깐 false

        for(int i = 2; i < Math.sqrt(n); i++){ // 2부터 n의 제곱근까지 모든 수를 확인
            if(isPrime[i]){ // 해당 수가 소수라면, 해당 수를 제외한 배수들을 모두 false 처리하기
                for(int j = i * i; j <= n; j += i){ // 그 이하 수는 모두 검사했으므로 i*i 부터 시작
                    isPrime[j] = false;
                }
            }
        }
    }

    /* 1 -main()
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 소수인지 판별할 숫자 input
        isPrime_fun(N);
        System.out.println(Arrays.toString(isPrime));
    }*/

    // 2

    private void printPrimeNumberLessThan(int number){
        int total = 0;
        for(int i = 2 ; i < number; i ++){
            if (isPrimeNumber(i)) {
                print(i);
            }
        }
    }

    private boolean isPrimeNumber(int targetNumber) {
        for(int i = 2 ; i < targetNumber; i++){
            if(targetNumber % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    private void print(int number) {
         System.out.printf("%d %n", number);
    }

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        int input = consoleScanner.nextInt();
        Algorithm primeNumberPrinter = new Algorithm();
        primeNumberPrinter.printPrimeNumberLessThan(input);

    }
}
