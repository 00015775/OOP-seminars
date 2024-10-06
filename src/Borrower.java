import java.util.ArrayList;

public class Borrower extends User {
    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    // borrowing book method, firstly checks if the book is available, and if yes it sets its status as false which is not available implying that it is borrowed
    public void borrowBook(Book book){
        if(book.getIsAvailable()){
            borrowedBooks.add(book);
            book.setIsAvailable(false);
        } else{
            System.out.println("The book is not available");
        }
    }

    // method to return book, firstly checks if a given book is contained in the list of borrowed books, and if yes then removes from list and sets availability of the book to true
    public void returnBook(Book book){
        if(borrowedBooks.contains(book)){
            borrowedBooks.remove(book);
            book.setIsAvailable(true);
        }
    }



}
