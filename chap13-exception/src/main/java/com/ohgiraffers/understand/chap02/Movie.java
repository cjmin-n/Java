package main.java.com.ohgiraffers.understand.chap02;

public class Movie {

    private String title; // 영화 제목
    private int time; // 상영 시간
    private int seat; // 총 좌석수

    public Movie(){}

    public Movie(String title, int time, int seat) {
        this.title = title;
        this.time = time;
        this.seat = seat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", time=" + time +
                ", seat=" + seat +
                '}';
    }

    // 좌석 예매하고, 남은 좌석 확인
    public void check(Movie movie){

        if(movie.getSeat() != 0){
            movie.setSeat(movie.getSeat() - 1);
            System.out.println(movie);
        }else if(movie.getSeat() == 0){
            System.out.println("예약할 좌석이 없습니다!");
        }

    }


}
