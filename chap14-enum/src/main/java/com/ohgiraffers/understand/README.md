# 학생 성적 관리 시스템

- 요구 사항
  학생 성적 관리 시스템 작성하기.
- 학생 추가 기능
    - 학생 이름, 학번, 학년, 성적을 입력받아 학생 정보를 추가함. 
    - 학번이 중복되면 등록되지 않음. 

- 학년별 학생 목록 보기 기능
    - 특정 학년의 학생 목록을 조회

- 성적 수정 기능
    - 학번을 입력 받아 해당 학생의 성적을 수정할 수 있음
    - 학번이 존재하지 않으면 오류 메세지를 출력함.

- 학생 정보 삭제 기능
    - 학번을 입력 받아 해당 학생의 정보를 삭제할 수 있음
    - 학번이 존재하지 않으면 오류 메세지 출력

## 학년을 관리하는 Grade 클래스는 enum 타입으로 관리
FRESHMAN - 1학년
SOPHOMORE - 2학년
JUNIOR - 3학년
SENIOR - 4학년




#
HashMap -> key: enum / value: ArrayList


### Application


1. 학생 추가
studentManager.addStudent(studentDTO)
   
   find(int num) - 있으면 등록안된다. 없으면 등록됨 - enumCheck(int grade) - Map 에 저장

2. 학년 별 학생 목록 보기 기능
특정학년 스캐너 입력 - 숫자

list() 에서 enumCheck(grade) -> String 실행해서
Map의 keyset() 으로 iterator 돌려서 같으면 value 출력


3. 성적 수정 기능
- 학번 입력 받기
- modify() -> for문 돌려서 존재 하지 않으면 오류메시지 / 있으면 수정 setScore() 


4. 학생 정보 삭제
- 학번 입력 받기
- delete() -> int find(int num); 1이면 성공/-1이면 실패 

9. 학생 찾기 메소드
find(int num) -> Map value 에서 똑같은거 찾기 

10. 아무도 없는지 찾는 메소드
nullCheck() -> if(map.isEmpty()){} - sout 출력



** 스캐너로 학년을 받아서 (숫자 or 문자열)

메소드에 매개변수로 -> enumCheck(int grade)
상수에서 그거랑 같은거 가져오기
리턴을 스트링으로 해줌
- 이거를 studentManager.addStudent()에서 호출해서
- Map에 저장




### StudentManger

HashMap<Students, StudentDTO>

1. addStudent(StudentDTO studentDTO);
- 리스트와 studentDTO의 학번을 확인해서 같으면 등록되지않음 / 같지 않으면 등록 됨 - add(studentDTO);

2. listUp(String grdade);
- 해당 키값의 value 출력


### StudentDTO
1. 변수
  - 이름, 학번 성적
2. 변수 초기화함수
3. 게터 세터
4. toString
 
### Students - ENum
상수 선언


