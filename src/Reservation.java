import java.util.Date;

public class Reservation {
    private int reservationId;
    private User user;
    private Book book;
    private Date reservationDate;

    public Reservation(int reservationId, User user, Book book, Date reservationDate){
        this.reservationDate = reservationDate;
        this.book = book;
        this.user = user;
        this.reservationId = reservationId;
    }

    public int getReservationId(){
        return reservationId;
    }
    public User getUser(){
        return user;
    }
    public Book getBook(){
        return book;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
