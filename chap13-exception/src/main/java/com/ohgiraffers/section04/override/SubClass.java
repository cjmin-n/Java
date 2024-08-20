package main.java.com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    // 예외 없이 오버라이드 할 수 있다.
    /*@Override             ->> 정상
    public void method(){} // 부모가 오류를 발생해도 재정의하면서 오류가 없을 수 있기 때문에 가능*/

    // 같은 예외를 던져주는 구문으로 오버라이딩 할 수 있다.
    /*@Override
    public void method() throws IOException{} // 정상*/

    // 부모의 예외보다 상위의 예외로는 할 수 없다.
    /*@Override
    public void method() throws Exception{} // 불가능*/

    // 하지만 더 하위로는 할 수 있다. (즉, 더 구체적인 상황)
    @Override
    public void method() throws FileNotFoundException {}



}
