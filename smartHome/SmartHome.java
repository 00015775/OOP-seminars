package smartHome;

public class SmartHome {

    public static void manageDevice(IControllable device){
        device.turnOn();
        if (device instanceof IConfigurable){
            IConfigurable configurable = (IConfigurable) device;
            configurable.configure("My new setting.");
        }

        if(device instanceof IMonitored){
            IMonitored monitored = (IMonitored) device;
            monitored.getStatusReport();
            monitored.startMonitoring();
            monitored.stopMonitoring();
        }

        device.turnOff();
    }

    public static void main(String[] args){

        SmartLight smartLight = new SmartLight();
        manageDevice(smartLight);


    }

}
