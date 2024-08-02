package section03.constant;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 상수란?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다.
        * 변하지 않는 값(고정된 값) 을 저장해두기 위한 메모리 상의 공간을 상수라고 한다.
        *
        * 상수의 사용 목적
        * 1. 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        * 2. 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.

        * 상수의 사용 방법
        * 1. 상수를 선언한다.
        * 2. 값을 초기화 한다.
        * 3. 필요한 위치에 호출해 사용한다.
        * */

        // 상수는 선언 시에 final 키워드를 붙인다.
        final int AGE; // 상수는 대문자로 작성한다. 변수와 구분하기 위함.

        AGE = 10;
        // AGE = 30; 에러. 초기화 이후 상수 값은 변경할 수 없다.

        System.out.println("AGE의 값 : " + AGE);

        System.out.println("AGE의 두배의 값 : " + (AGE * 2));
        
        // 변수에 대입 가능
        int sum = AGE;
        sum += 10;


        
    }
}
