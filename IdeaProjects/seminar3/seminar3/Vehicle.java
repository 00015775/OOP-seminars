abstract class Vehicle {
    String name;

    Vehicle(String name){
        this.name = name;
    }
    abstract void display();
    void Wheel(){
        System.out.println("Here is the wheel");
    }
}
