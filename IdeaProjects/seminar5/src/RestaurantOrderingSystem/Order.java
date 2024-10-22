package RestaurantOrderingSystem;
import javax.lang.model.type.MirroredTypeException;
import java.util.ArrayList;

public class Order implements  IOrderable{
    private ArrayList<MenuItem> items;
    private double totalPrice;
    public Order(){
        items = new ArrayList<>();
        totalPrice = 0;
    }

    public void addItem(MenuItem item){
        items.add(item);
    }
    public void removeItem(MenuItem item){
        items.remove(item);
    }

    @Override
    public void placeOrder() {
        double total = 0;
        for(MenuItem item: items){
            total += item.calculatePrice();
        }
        totalPrice = total;
        System.out.println("The order has been placed. The total price: "+ total);
    }

    @Override
    public void generateReceipt() {
        for(MenuItem item: items){
            item.displayDetails();
        }
        System.out.println("Total price:$ "+ totalPrice);
    }
}
