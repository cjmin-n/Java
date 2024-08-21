package classDiagram.controller;

import classDiagram.model.comparator.AscCategory;
import classDiagram.model.comparator.DescCategory;
import classDiagram.model.dto.BookDTO;

import java.util.ArrayList;



public class BookManager {

    public ArrayList<BookDTO> bookList;


    public BookManager() {
        bookList = new ArrayList<BookDTO>();
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

        /*for(BookDTO bookDTO : bookList){
            *//*System.out.println(bookDTO);*//*
            bookList.add(bookDTO);
        }*/

        return this.bookList;
    }

    public void printBookList(ArrayList<BookDTO> br){

        if (br.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
        }else {
            for(BookDTO bookDTO : br){
                // System.out.println(bookDTO);
                System.out.println(bookDTO.getbNo() + "번 | 도서분류코드 : " + bookDTO.getCategory() + " | 도서 제목 : " + bookDTO.getTitle() + " | 도서 저자 : " + bookDTO.getAuthor());
            }
        }

    }



    public int searchBook(String bTitle){
        int num = 0;

        if(bookList.isEmpty()){
            // 등록된 도서 없을 때
            System.out.println("등록된 도서가 없습니다.");

            return -1;
        }else {
            // 등록된 도서 있을 때

            for (int i = 0; i < bookList.size(); i++) {
                /*System.out.println("bookList size : " + bookList.size());
                System.out.println(i);
                System.out.println("지금꺼" + bTitle + "? 리스트꺼" + bookList.get(i).getTitle());*/

                if(bTitle.equals(bookList.get(i).getTitle())){

                    //System.out.println("둘이 똑같은거 !");

                    num = i;

                    return num;

                }
            }


            return -1;

        }


    }

    public void deleteBook(int index){
        if (index != -1){

            bookList.remove(index);
            System.out.println("성공적으로 삭제 !");
        }
    }

    public void printBook(int index){
        // System.out.println(bookList.get(index));
        BookDTO findBook = bookList.get(index);
        System.out.println(findBook.getbNo() + "번 | 도서분류코드 : " + findBook.getCategory() + " | 도서 제목 : " + findBook.getTitle() + " | 도서 저자 : " + findBook.getAuthor());
    }

    public void displayAll(){
        //System.out.println(bookList);
        for(BookDTO bookDTO : bookList){
            System.out.println(bookDTO.getbNo() + "번 | 도서분류코드 : " + bookDTO.getCategory() + " | 도서 제목 : " + bookDTO.getTitle() + " | 도서 저자 : " + bookDTO.getAuthor());
        }

    }




}
