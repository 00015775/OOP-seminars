import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create some Book objects
        Book book1 = new Book(1, "Book1", "author1", true);
        Book book2 = new Book(2, "Book2", "author2", true);
        Book book3 = new Book(3, "Book3", "author3", true);

        // Step 2: Create a Borrower object
        Borrower borrower = new Borrower();
        borrower.setName("John");
        borrower.setUserId(101);
        borrower.setEmail("john@example.com");

        // Step 3: Borrow some books
        System.out.println("Borrowing books...");
        borrower.borrowBook(book1);
        borrower.borrowBook(book2);

        // Step 4: Display borrowed books
        System.out.println("\nList of borrowed books:");
        displayBorrowedBooks(borrower);

        // Step 5: Try to borrow a book that's already borrowed
        System.out.println("\nTrying to borrow a book that's already borrowed:");
        borrower.borrowBook(book1);

        // Step 6: Return a book
        System.out.println("\nReturning a book...");
        borrower.returnBook(book1);

        // Step 7: Display borrowed books after returning one
        System.out.println("\nList of borrowed books after returning one:");
        displayBorrowedBooks(borrower);
    }

    // Helper method to display borrowed books
    public static void displayBorrowedBooks(Borrower borrower) {
        ArrayList<Book> borrowedBooks = borrower.getBorrowedBooks();
        for (Book book : borrowedBooks) {
            System.out.println("Book ID: " + book.getBookId() + ", Title: " + book.getTitle());
        }
    }
}