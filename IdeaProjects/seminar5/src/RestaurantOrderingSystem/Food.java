package RestaurantOrderingSystem;

public class Food extends MenuItem{
    private int preparationTime;


    public Food(String name, double price, int preparationTime, double takeAwayFee, boolean dineIn) {
        super(name, price, takeAwayFee, dineIn);
        this.preparationTime = preparationTime;
    }

    @Override
    public double calculatePrice() {
        return price + (dineIn ? 0 : takeAwayFee);
    }

    @Override
    public void displayDetails() {
        String type = dineIn ? "Dine-in" : "Takeaway";
        System.out.println(name + ", Type: "+ type + ", Preparation time: "+ preparationTime + ", Price$: "+ price);
    }
}
