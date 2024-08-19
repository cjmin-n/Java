package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 50000));

        // Collections.sort(bookList); 객체 리스트는 어떤거를 기준으로 정렬해야할지몰라서 안됨.

        // 정렬 전 책 리스트 출력
        for(BookDTO book : bookList){
            System.out.println(book);
            /*
            BookDTO{num=1, title='홍길동전', author='허균', price=50000}
            BookDTO{num=2, title='목민심서', author='정약용', price=30000}
            BookDTO{num=3, title='동의보감', author='허준', price=40000}
            BookDTO{num=4, title='삼국사기', author='김부식', price=45000}
            BookDTO{num=5, title='삼국유사', author='일연', price=50000}
            * */
        }

        /*
        * Comparator 인터페이스를 상속 받아 정렬의 기준을 정해줌.
        * list 의 sort() 메소드의 인자로 정렬 기준이 되는 인스턴스를 넣어주면
        * 우리가 오버라이딩 한 메소드가 동작하게 되며 그것을 정렬 기준으로 삼는다.
        *
        * */

        System.out.println("----- 가격 오름차순 정렬 -----");
        bookList.sort(new AscendingPrice()); // 정렬기준 세움
        for(BookDTO book : bookList){
            System.out.println(book);

            /* 오름차순
            BookDTO{num=2, title='목민심서', author='정약용', price=30000}
            BookDTO{num=3, title='동의보감', author='허준', price=40000}
            BookDTO{num=4, title='삼국사기', author='김부식', price=45000}
            BookDTO{num=1, title='홍길동전', author='허균', price=50000}
            BookDTO{num=5, title='삼국유사', author='일연', price=50000}*/
        }

        // 책제목을 기준으로 오름차순
        System.out.println("----- 책제목 기준 오름차순 -----");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                // compareTo : 앞의 값이 더 작은 경우 음수 반환
                // 같으면 0, 앞이 크면 양수 반환
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        for(BookDTO book : bookList){
            System.out.println(book);
            /*
            BookDTO{num=3, title='동의보감', author='허준', price=40000}
            BookDTO{num=2, title='목민심서', author='정약용', price=30000}
            BookDTO{num=4, title='삼국사기', author='김부식', price=45000}
            BookDTO{num=5, title='삼국유사', author='일연', price=50000}
            BookDTO{num=1, title='홍길동전', author='허균', price=50000}
            * */
        }
        System.out.println("----- 책제목 기준 오름차순 -----");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        for(BookDTO book : bookList){
            System.out.println(book);
            /*
            BookDTO{num=1, title='홍길동전', author='허균', price=50000}
            BookDTO{num=5, title='삼국유사', author='일연', price=50000}
            BookDTO{num=4, title='삼국사기', author='김부식', price=45000}
            BookDTO{num=2, title='목민심서', author='정약용', price=30000}
            BookDTO{num=3, title='동의보감', author='허준', price=40000}
            * */
        }


        System.out.println("----- 책작가 기준 오름차순 -----");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        for(BookDTO book : bookList){
            System.out.println(book);
            /*
            BookDTO{num=4, title='삼국사기', author='김부식', price=45000}
            BookDTO{num=5, title='삼국유사', author='일연', price=50000}
            BookDTO{num=2, title='목민심서', author='정약용', price=30000}
            BookDTO{num=1, title='홍길동전', author='허균', price=50000}
            BookDTO{num=3, title='동의보감', author='허준', price=40000}
            * */
        }

        System.out.println("----- 책작가 기준 내림차순 -----");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o2.getAuthor().compareTo(o1.getAuthor());
                /*return o1.getAuthor().compareTo(o2.getAuthor()) * -1;*/
            }
        });
        for(BookDTO book : bookList){
            System.out.println(book);
            /*
            BookDTO{num=3, title='동의보감', author='허준', price=40000}
            BookDTO{num=1, title='홍길동전', author='허균', price=50000}
            BookDTO{num=2, title='목민심서', author='정약용', price=30000}
            BookDTO{num=5, title='삼국유사', author='일연', price=50000}
            BookDTO{num=4, title='삼국사기', author='김부식', price=45000}
            * */
        }


    }
}
