package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args){

        // 얕은 복사를 활용해 매개변수와 리턴값으로 활용해보자
        String[] names = {"홍길동", "유관순", "이순신"};

        System.out.println(names.hashCode());
        print(names);
        String[] animals = getAnimals();
        System.out.println("animals.hashCode() = " + animals.hashCode());

        print(animals);



    }

    public static void print(String[] args){
        System.out.println(args.hashCode());

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }


    public static String[] getAnimals(){
        String[] animals = {"낙타", "호랑이", "나무늘보"};

        System.out.println("animals.hashCode() = " + animals.hashCode());

        return animals;
    }
}
