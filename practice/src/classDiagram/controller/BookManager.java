package classDiagram.controller;

import classDiagram.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> books;

    public BookManager() {
    }

    public BookManager(ArrayList<BookDTO> books) {
        this.books = books;
    }

    private void addBook(BookDTO book){}

    private void deleteBook(int index){}

    private int searchBook(String bTitle){}

    private void printBook(int index){}

    private void displayAll(){}

    private ArrayList<BookDTO> sortedBookList(int select){}

    private void printBookList(ArrayList<BookDTO> br){}


}
