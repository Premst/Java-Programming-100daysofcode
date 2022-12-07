/*
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */

// day-100 100daysofcodechallenge completed 
import java.util.ArrayList;
class Book{
    public String name, author;
    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
    @Override 
    public String toString(){
        return "Book{"+"name="+name+'\''+", author='"+author+'\''+'}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.remove(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to "+issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }
}

public class practice_100 {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithms", "CLRS");
        bk.add(b1);
        Book b2 = new Book("Data Structure", "author2");
        bk.add(b2);
        Book b3 = new Book("Math", "Author3");
        bk.add(b3);
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("algo4", "myAuthor"));
        System.out.println(l.books);
        l.issueBook(b3, "Prem");
        System.out.println(l.books);
    }
}
