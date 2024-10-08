public class Bus extends Vehicle{
    String type;
    Bus(String name, String type){
        super(name);
        this.type = type;
    }
    @Override
    void display(){
        System.out.println("Bus type: "+ type);
    }
}
