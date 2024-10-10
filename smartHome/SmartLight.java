package smartHome;

public class SmartLight implements IControllable, IConfigurable {

    private boolean on;
    private String configuration;


    @Override
    public void turnOn(){
        on = true;
        System.out.println("Smart lights are ON.");
    }

    @Override
    public void turnOff(){
        on = false;
        System.out.println("Smart lights are OFF.");
    }

    @Override
    public boolean isOn(){
        return on;
    }

    @Override
    public void configure(String settings){
        configuration = settings;
        System.out.println("New Configuration has been set.");
    }

    @Override
    public String getConfiguration(){
        return configuration;
    }

    public void scheduleTurnOnOff(String schedule){
        System.out.println("The new schedule has been set.");
    }

}
