package classDiagram.controller;

import classDiagram.model.comparator.AscCategory;
import classDiagram.model.comparator.DescCategory;
import classDiagram.model.dto.BookDTO;
import classDiagram.view.BookMenu;

import java.util.ArrayList;



public class BookManager {

    public ArrayList<BookDTO> bookList;
    BookMenu bm = new BookMenu();


    public BookManager() {
        bookList = new ArrayList<BookDTO>();
    }

    public BookManager(ArrayList<BookDTO> books) {
        this.bookList = books;
    }


    public void addBook(BookDTO book){

        bookList.add(book);

    }

    public ArrayList<BookDTO> sortedBookList(int select){


        if(select == 1){
            bookList.sort(new AscCategory());
        }else if(select == 2){
            bookList.sort(new DescCategory());
        }

        for(BookDTO bookDTO : bookList){
            System.out.println(bookDTO);
        }

        return this.bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){
        for(BookDTO bookDTO : br){
            System.out.println(bookDTO);
        }
    }



    public int searchBook(String bTitle){
        int num = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if(bTitle.equals(bookList.get(i).getTitle())){
                num = i;
            }else {
                return -1;
            }
        }

        return num;
    }

    public void deleteBook(int index){
        bookList.remove(index);
    }

    public void printBook(int index){

    }

    public void displayAll(){
        System.out.println(bookList);
    }






}
