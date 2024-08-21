# 영화관 티켓 예매 시스템 구현

Movie  클래스
- 영화 제목, 상영 시간, 총 좌석 수, 예약된 좌석 수 를 속성으로 가짐
- 좌석을 예매하고, 남은 좌석을 확인하는 메소드를 가짐.
- 좌석이 모두 예약된 경우 예매 불가

MovieTheater 클래스
- 여러 개의 Movie 객체를 가짐
- 영화 추가, 영화 목록 조회, 특정 영화 예매 메소드를 가짐

Application 에서 몇 편의 영화를 추가할지 물어보고 영화를 추가한 후
현재 상영 중인 영화 목록을 보여준 다음,

특정 영화 좌석 예매, 상영 중인 영화 목록 조회 중 선택하고 진행


## 선생님 방식

### Application
- 스캐너 입력
- 영화 추가하기
- 영화목록 출력
  - theater.listMovies();
- 예매 및 관리기능
  - while 무한루프
    1. 좌석예매 - 영화제목 받아서 theater.bookSeatForMovie(title);
    2. 영화 목록 조회 - theater.listMovies();
    3. 종료

### Movie -> DTO
- 변수 선언
  - private String title;  // 제목
    private String showTime;  // 상영 시간
    private int totalSeats;  // 총 좌석수
    private int bookedSeats; // 예약된 좌석 수
- Movie 생성자 초기화 함수 -> title, showTime, totalSeats
- getTitle(), getShotTime()
- 좌석예매 메소드 -> public boolean bookSeat() 
  - 총 좌석이 예약된 좌석보다 크면 예약된 자석이 ++ / sout : title 예매 안내 + 좌석수 안내
  - 작으면 sout: 좌석매진 안내
- 남은 좌석 메소드 -> getAvailableSeats(); -> total-bookedSeats return

### MovieTheater
- movies ArrayList 선언
- 기본 생성자에 ArrayList 초기화 -> ????????왜 그런지 물어보기 !
- 영화 추가 메소드 -> addMovie(Movie movie) - movies.add(movie);
- 영화 목록 조회 메소드 -> listMovies() -> for 향상문 movie 중 title + showTime + getAvailableSeats();
- 특정 영화 찾기 메소드 -> findMovie(String title); -> for 향상문 movie제목과 제목이 같으면 제목 반환 없으면 null
- 특정 영화 좌석 예매 메소드 -> bookSeatForMovie(String title) -> movie 객체에 findMovie(title) 할당 - 영화가 있으면 movie.bookSeat(); 없으면 찾을 수 없다고 안내



## 내 방식

### Application
- 스캐너 입력
- 영화 추가하기 movieTheater.add()
- 상영중인 영화 목록 movieTheater.list()
- while 무한루프 반복
  1. 특정 영화 좌석 예매 - movieTheater.reservation(num);
  2. 상영중인 영화 목록 조회 - movieTheater.list();
  3. 종료

### Movie
- 변수선언
    private String title; // 영화 제목
    private int time; // 상영 시간
    private int seat; // 총 좌석수
- 생성자 전체 초기화 함수 title, time, seat
- getSeat, setSeat
- toString
- 좌석예매하고 남은 좌석 확인 하는 메소드 - check(Movie movie) -> 좌석이 0 이 아니면 좌석 -1 셋팅 / 0이면 예약할 좌석이 없습니다 !


### MovieTheater
- ArrayList movies 선언 후 초기화
- Movie movie 선언
- 영화 추가 메소드 - addMovie(Movie movie) -> movies.add(movie);
- 영화 목록 조회 메소드 - list() -> for문 몇번 영화인지 리스트 보여주기
- 특정 영화 예매 - reservation(int num) -> movie.check(movies.get(num-1));


