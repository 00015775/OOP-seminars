public class Car extends Vehicle{
    String engine;

    Car(String name, String engine){
        super(name);
        this.engine = engine;
    }

    @Override
    void display(){
        System.out.println("Car engine: "+ engine);
    }

}
