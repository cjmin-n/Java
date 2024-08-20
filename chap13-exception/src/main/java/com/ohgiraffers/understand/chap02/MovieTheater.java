package main.java.com.ohgiraffers.understand.chap02;

import java.util.ArrayList;

public class MovieTheater {

    /*public Movie[] movies = new Movie[10];*/
    ArrayList<Movie> movies = new ArrayList<>();
    // private int rNum; // 입력 받은 영화 갯수
    Movie movie = new Movie();

    // 영화 추가
    public void addMovie(Movie movie){
        // movies[rNum++] = movie;


        System.out.println(movie);
        movies.add(movie);
    }

    // 영화 목록 조회
    public void list(){

        System.out.println("상영중인 영화 리스트!");
        for (int i = 0; i < movies.size(); i++) {
            /*System.out.print(movies[i].getTitle() + " ");*/
            System.out.println((i+1) + "번 : " + movies.get(i));
        }
        System.out.println();

    }
    // 특정 영화 예매
    public void reservation(int num){

      movie.check(movies.get(num-1));

    }
}
