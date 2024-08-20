package classDiagram.view;

import classDiagram.controller.BookManager;
import classDiagram.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();
    BookDTO book;

    public BookMenu() {
    }
    private void menu(){




    }

    public BookDTO inputBook(){
        System.out.println("도서 번호를 입력해주세요.");
        int bNo = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 제목을 입력해주세요.");
        String title = sc.nextLine();
        System.out.println("도서 장르를 입력해주세요. (1.인문 / 2.자연과학 / 3.의료 / 4.기타)");
        int category = sc.nextInt();
        String author = sc.nextLine();

        book = new BookDTO(bNo, category, title, author);
        return book;
    }

    private String inputBookTitle(){
        String title = sc.nextLine();

        return title;
    }

}
