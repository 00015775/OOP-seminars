package Aggregation;

public class Main{
    public static void main(String[] args){
        Engine engine1 = new Engine("V8");
        Engine engine2 = new Engine("Electric");

        Car car1 = new Car(engine1);
        Car car2 = new Car(engine2);

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}