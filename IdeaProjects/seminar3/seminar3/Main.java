import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Book book = new Book();
        Product product = new Product();
        book.name = "1984";
        book.price = 100.23;
        book.author = "John";
        book.displayInfo();

        // when reference is different, it cannot access any class attributes or methods outside of that reference
        Bus bus = new Bus("BMW", "Electrical");
        bus.display();
        bus.Wheel();

        Enginner enginner = new Enginner("Mike", "Development", "Engineer");
        enginner.displayInfo();

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] =  new Circle(3.3);
        shapes[3] = new Rectangle(6.0, 7.0);

        for (Shape shape: shapes){
            shape.calculateArea();
        }
        PremiumMobileApp app = new PremiumMobileApp("Name","Version", "Platform" );
        app.displayDetails();
        app.supportDuration(10);
    }
}
