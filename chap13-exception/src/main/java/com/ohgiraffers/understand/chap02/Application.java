package main.java.com.ohgiraffers.understand.chap02;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        MovieTheater movieTheater = new MovieTheater();
        String title = "";
        int time = 0;
        int seat = 0;
        Movie movie;


        Scanner scr = new Scanner(System.in);
        System.out.println("=== 영화관 프로그램 ===");
        System.out.println("몇 편의 영화를 추가할까요? (최대 10편)");
        int no = scr.nextInt();
        scr.nextLine();


        for (int i = 0; i < no; i++) {

            System.out.println("영화 제목을 입력해주세요.");
            title = scr.nextLine();


            System.out.println("상영시간을 입력해주세요.");
            time = scr.nextInt();

            System.out.println("좌석수를 입력해주세요.");
            seat = scr.nextInt();
            scr.nextLine();

            // 영화 추가 메소드
            movie = new Movie(title, time, seat);
            // movies.add(new Movie(title, time, seat));
            // System.out.println(movies);
            movieTheater.addMovie(movie);

        }



        // 현재 상영중인 영화 목록
        movieTheater.list();

        while(true){
            System.out.println("번호를 선택해주세요.");
            System.out.println("1. 특정 영화 좌석 예매");
            System.out.println("2. 상영 중인 영화 목록 조회");
            System.out.println("9. 프로그램 종료");
            int choice = scr.nextInt();

            switch(choice){
                case 1 :
                    System.out.println("리스트 중 예매할 번호를 선택해주세요.");
                    int num = scr.nextInt();
                    movieTheater.reservation(num);

                    break;
                case 2 : movieTheater.list(); break;
                case 9 :
                    System.out.println("프로그램을 종료합니다!");
                    return;
                default:
                    System.out.println("다시 입력해주세요."); break;
            }
        }


    }
}
