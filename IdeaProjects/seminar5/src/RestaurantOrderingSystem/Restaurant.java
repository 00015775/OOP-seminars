package RestaurantOrderingSystem;

public class Restaurant {
    public static void  main(String[] args){
        Food spagetti = new Food("Spagetti", 12.3, 10, 2.5,true);
        Food sushi = new Food("Sushi", 25.3, 8, 1.8,false);
        Beverage cola = new Beverage("Cola", 6.7, 2, true,false);
        Beverage pepsi = new Beverage("Pepsi", 7.3, 3, false,true);

        Order order = new Order();

        order.addItem(spagetti);
        order.addItem(sushi);
        order.addItem(cola);
        order.addItem(pepsi);

        order.placeOrder();
        order.generateReceipt();
    }
}
