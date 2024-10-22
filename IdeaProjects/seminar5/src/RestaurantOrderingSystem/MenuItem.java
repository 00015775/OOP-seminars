package RestaurantOrderingSystem;

public abstract class MenuItem {
    String name;
    double price;
    double takeAwayFee;
    boolean dineIn;

    public MenuItem(String name, double price, double takeAwayFee, boolean dineIn){
        this.name= name;
        this.price = price;
        this.takeAwayFee = takeAwayFee;
        this.dineIn = dineIn;
    }

    public abstract double calculatePrice();
    public abstract void displayDetails();

}
