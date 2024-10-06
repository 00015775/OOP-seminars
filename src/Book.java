public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;


    public Book(int bookId, String title, String author, boolean isAvailable){
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.isAvailable = isAvailable;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getBookId(){
        return bookId;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setBookId(int bookId){
        this.bookId = bookId;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


}
