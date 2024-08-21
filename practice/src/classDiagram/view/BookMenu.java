package classDiagram.view;

import classDiagram.controller.BookManager;
import classDiagram.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bookManager = new BookManager();
    BookDTO bookDTO;


    public void menu(){

        while(true){
            System.out.println("==== 도서 관리 프로그램 ====");

            System.out.println("1. 새도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");

            int no = sc.nextInt();
            sc.nextLine();

            switch (no) {
                case 1:
                    // 새도서 추가
                    /*addBook (inputBook()이 리턴한 객체) 실행 */
                    bookManager.addBook(inputBook());
                    break;
                case 2:
                    // 도서정보 정렬 후 출력
                    /*sortedBookList(정렬종류번호) 실행
                     =>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
                     정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
                     1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력*/
                    System.out.println("정렬방식을 선택해주세요.(1. 오름차순, 2.내림차순)");
                    int num = sc.nextInt();
                    if(num != 1 && num != 2){
                        System.out.println("번호를 잘못입력하셨습니다.");
                    }else {
                        bookManager.printBookList(bookManager.sortedBookList(num));
                    }

                    break;
                case 3:
                    // 도서 삭제
                    /* deleteBook (도서 번호) 실행
                     => searchBook()메소드를 이용
                    => 결과값 리턴 받아 0일 경우 “성공적으로 삭제”
                    1일 경우 “삭제할 글이 존재하지 않음” */
                    System.out.println("삭제할 제목을 입력해주세요");
                    String title = sc.nextLine();
                    int deleteIndex = bookManager.searchBook(title);

                    bookManager.deleteBook(deleteIndex);

                    break;
                case 4:
                    // 도서 검색
                    /*searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
                     => index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
                    -1이 아닐 경우 printBook(index) 출력*/
                    int findIndex = bookManager.searchBook(inputBookTitle());

                    if( findIndex == -1){
                        System.out.println("조회한 도서가 존재하지 않음");
                    }else {
                        bookManager.printBook(findIndex);
                    }

                    break;
                case 5:
                    // 전체 출력
                    /*displayAll() 실행
                        => 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
                    아닌 경우는 전체 출력*/

                    if(bookManager.bookList.isEmpty()){
                        System.out.println("출력할 도서가 없습니다.");
                    }else {
                        bookManager.displayAll();
                    }

                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다."); return;
                default :
                    System.out.println("다시 입력해주세요.");
                    continue;

            }
        }


    }

    public BookDTO inputBook(){
        System.out.println("도서 번호를 입력해주세요.");
        int bNo = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 제목을 입력해주세요.");
        String title = sc.nextLine();
        System.out.println("도서 장르를 입력해주세요. (1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 저자를 입력해주세요.");
        String author = sc.nextLine();

        bookDTO = new BookDTO(bNo, category, title, author);
        return bookDTO;
    }

    private String inputBookTitle(){
        System.out.println("도서 제목을 입력해주세요.");

        String title = sc.nextLine();

        return title;
    }



}
