package main.java.com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {

        /*
        * 객체 배열?
        * 객체 배열은 레퍼런스 변수에 대한 배열이다.
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동일한 타입의 여러 개 인스턴스를 각각 취급하지 않고
        * 연속 처리할 수 있어서 유용하다.
        * 또한 반환값은 1개의 값만 반환할 수 있기 때문에
        * 동일한 타입의 여러 인스턴스를 반환해야 하는 경우
        * 객체배열을 이용할 수 있다.
        * */

        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);
        Car car4 = new Car("부가티", 400);
        Car car5 = new Car("소나타", 200);

        car1.driveMaxSpeed(); // 페라리이(가) 최고 속도 300km/h 로 달려갑니다.
        car2.driveMaxSpeed(); // 람보르기니이(가) 최고 속도 350km/h 로 달려갑니다.
        car3.driveMaxSpeed(); // 롤스로이스이(가) 최고 속도 250km/h 로 달려갑니다.
        car4.driveMaxSpeed(); // 부가티이(가) 최고 속도 400km/h 로 달려갑니다.
        car5.driveMaxSpeed(); // 소나타이(가) 최고 속도 200km/h 로 달려갑니다.


        Car[] carArray = new Car[5];
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);
        carArray[3] = new Car("부가티", 400);
        carArray[4] = new Car("소나타", 200);

        System.out.println("-------------------------------------------");
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }
        System.out.println("-------------------------------------------");
        for (Car car : carArray){
            car.driveMaxSpeed();
        }

    }
}
