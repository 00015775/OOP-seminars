import java.util.Date;

public class Loan {
    private int loadId;
    private Date loanDate;
    private Date returnDate;
    private Borrower borrower;
    private Book book;

    public Loan(int loadId, Date loanDate, Date returnDate, Borrower borrower, Book book){
        this.loadId = loadId;
        this.returnDate = returnDate;
        this.loanDate = loanDate;
        this.book = book;
        this.borrower = borrower;
    }

    public Book getBook() {
        return book;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public int getLoadId() {
        return loadId;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
