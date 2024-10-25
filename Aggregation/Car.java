package Aggregation;

public class Car {
    private Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    public void displayCarInfo(){
        System.out.println("Car with ");
        engine.displayEngineInfo();
    }
}
