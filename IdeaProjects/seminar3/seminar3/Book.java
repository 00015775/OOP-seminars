public class Book extends Product{
    String author;

    Book(){
        author = "unknown";
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author's name: "+ author);
    }
}
