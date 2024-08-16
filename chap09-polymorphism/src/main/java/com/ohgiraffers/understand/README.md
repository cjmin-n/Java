# interface를 이해하자
## 주제 : 사용자가 sns를 이용한 로그인 기능
### 과제내용
MemberDTO.class : 사용자가 로그인을 하기 위한 정보를 담는다. ID/PWD

MemberService.class : MemberDTO 클래스를 매개변수로 받고 기존에 있는 사용자와
같은 값을 갖는지 확인한다. login() / singUp()

SnsAuth.interface : loging() 제공한다. 여유가 있는 수강생의 경우 singup()도 추가로 구현한다.

sns 인증 방식은 총 3가지를 제공한다.
아래의 클래스는 SnsAuth를 상속받아 구현한다.

1. googleAuth
2. kakaoAuth
3. naverAuth
### 프로그램 흐름
main에서 scanner를 통해 사용자에게 인증 방식을 입력받는다. <br>
인증 방식이 결정되면 사용자에게 아이디 비밀번호를 입력받는다. <br>
입력 받은 인증에 따라 사용자에게 sns 인증 방식을 제공한다.

#### 출력화면 예시
1. 없는 회원의 경우 : 000 인증된 회원이 없습니다.
2. 존재하는 회원의 경우 : 000에 인증된 id님 환영합니다.



### 처음에 생각한 방식 (되는지 확인해봐야함)
1. MemberDTO.class 
   1. id, pwd private 변수만들기
   2. 생성자 만들기(전체 초기화)
   3. getter,setter(?) 만들기
   4. toString? - 확인용
1. MemberSerivce.class 
   1. Member DTO 클래스를 매개변수로 받는 메소드 생성 
   2. MemberDTO[] 만들어서 회원 정보 만들어둠 
   3. Application에서 받은 클래스와 MemberDTO[] forEach문으로 비교(if문)
      1. true 일때 true값 반환 + 인증값 받아서 출력값에 추가해주기 / MemberDTO.getId() "000에 인증된 id님 환영합니다."
      2. false일 때 false 값 반환 + 인증값 받아서 출력값에 추가해주기 "000 인증된 회원이 없습니다."
1. SnsAuth - String login();
2. Kakao, Naver, GoogleAuth : public String login(){ return "각각의 이름"};
1. Application.class
   1. Scanner로 사용자 인증방식 받음
   2. 아이디, 비번도 받음 -> MemberDTO 전체 생성자로 받기
   2. 무한루프 반복문에 switch로 1구글,2카카오,3네이버, 9프로그램종료, default: 다시 입력해주세요
   3. 1,2,3 선택하면 SnsAuth의 login() 실행
   4. login() 에서 각각 return 값으로 String 받기 - 각각의 인증 종류
   5. String 값을 MemberSerivce에 받아서 비교 메소드 안에 true/false에 같이 출력
   

### 선생님이 준 결과값 보고 생각한 방식 (성공 )
1. MemberDTO.class (똑같음)
    1. id, pwd private 변수만들기
    2. 생성자 만들기(전체 초기화)
    3. getter,setter(?) 만들기
    4. toString? - 확인용
1. MemberSerivce.class
    1. Member DTO 클래스를 매개변수로 받는 메소드 생성 (findMember())
    2. MemberDTO[] 만들어서 회원 정보 만들어둠 - static 
    3. findMember는 boolean 값으로 return이여서 findeMember(MemberDTO memberDTO)에서 SnsAuth.login(member)가 true일 때 true반환.
    4. SnsAuth를 private static SnsAuth snsAuth; 변수화하고 public MemberService(SnsAuth snsAuth){this.snsAuth = snsAuth;}로 초기화. 
1. SnsAuth - Boolean login();
2. Kakao, Naver, GoogleAuth : public boolean login(MemberDTO member){ forEach문으로 MemberService.MemberDTO의 각각 개인(defaultMember)으로 if문 member와 defaultMember아이디, 패스워드가 같은지 비교 후 true / false로 반환 };
1. Application.class
    1. Scanner로 사용자 인증방식 받음
    2. 아이디, 비번도 받음 -> MemberDTO 전체 생성자로 받기
    2. 무한루프 반복문에 switch로 1구글,2카카오,3네이버, 9프로그램종료, default: 다시 입력해주세요
    3. 1,2,3 선택하면 new MemberSerive(new KakaoAuth())등 각각 실행. MemberSerive.findMember(memberDTO)가 true이면 각기 인증방식으로 로그인성공 + 아이디값 출력.