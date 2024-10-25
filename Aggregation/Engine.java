package Aggregation;

public class Engine {
    private String type;

    public Engine(String type){
        this.type = type;
    }

    public void displayEngineInfo(){
        System.out.println("Engine type: " + type);
    }

}
