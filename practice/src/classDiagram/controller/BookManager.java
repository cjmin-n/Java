package classDiagram.controller;

import classDiagram.model.dto.BookDTO;
import classDiagram.view.BookMenu;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;
    BookMenu bm = new BookMenu();


    public BookManager() {
        bookList = new ArrayList<BookDTO>();
    }

    public BookManager(ArrayList<BookDTO> books) {
        this.bookList = books;
    }

    private void addBook(BookDTO book){
        bm.inputBook(); // 리턴값 new BookDTO(bNo, category, title, author);
    }

    private void deleteBook(int index){

    }

    private int searchBook(String bTitle){

        return 0;
    }

    private void printBook(int index){

    }

    private void displayAll(){
        System.out.println();
    }

    private ArrayList<BookDTO> sortedBookList(int select){
        return null;
    }

    private void printBookList(ArrayList<BookDTO> br){}


}
