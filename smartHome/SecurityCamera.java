package smartHome;

public class SecurityCamera implements IConfigurable, IMonitored, IControllable{

    private boolean on;
    private String configuration;
    private boolean isMonitoring;

    @Override
    public void configure(String settings) {
        configuration = settings;
    }

    @Override
    public String getConfiguration() {
        return configuration;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void startMonitoring() {
        if(on){
            isMonitoring = true;
            System.out.println("Monitoring started.");
        }else{
            System.out.println("The camera is NOT monitoring.");
        }
    }

    @Override
    public void stopMonitoring() {
        isMonitoring = false;
        System.out.println("Monitoring stopped.");
    }

    @Override
    public String getStatusReport() {
        return isMonitoring? "Monitoring": "Not monitoring";
    }
}
