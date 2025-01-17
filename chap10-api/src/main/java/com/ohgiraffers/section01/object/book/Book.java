package main.java.com.ohgiraffers.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){ // 매개변수로 받은 obj와 '나'와 같은지 - a.equals(b) a = this / b = obj : 주소가 같은지 확인
            return true;
        }

        if(obj == null){
            return false;
        }

        Book other = (Book)obj;

        if(this.number != other.number){
            return false;
        }

        if(this.title == null){
            if(other.title != null){
                return false;
            }
        }else if(!this.title.equals(other.title)){
            return false;
        }

        if(this.author == null){
            if(other.author != null){
                return false;
            }
        }else if(!this.author.equals(other.author)){
            return false;
        }

        if(this.price != other.price){
            return false;
        }

        return true;
    }


    @Override
    public int hashCode() { // 같은 값일 때만 같은 해시코드가 나올 수 있도록 오버라이드해준 것.
        int result = 1;
        final int PRIME = 31; // 소수, 다른값 곱해줬을 때 중복값이 제일 잘안나와서

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }


}
