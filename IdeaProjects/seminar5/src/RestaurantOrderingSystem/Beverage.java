package RestaurantOrderingSystem;

public class Beverage extends MenuItem{
    private boolean isHot;


    public Beverage(String name, double price,double takeAwayFee, boolean dineIn, boolean isHot) {
        super(name, price, takeAwayFee, dineIn);
        this.isHot = isHot;
    }

    @Override
    public double calculatePrice() {
        return price + (dineIn ? 0 : takeAwayFee);
    }

    @Override
    public void displayDetails() {
        String type  = dineIn ? "Dine-in" : "Takeaway";
        String taste = isHot ? "Hot" : "Cold";
        System.out.println(name + ", Type: "+ type + ", Temperature: "+ taste + ", Price$: "+ price);
    }
}
