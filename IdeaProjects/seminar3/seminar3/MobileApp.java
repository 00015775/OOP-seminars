public class MobileApp extends SoftwareProduct{
    String platform;
    public MobileApp(String name,String version, String platform){
        super(name, version);
        this.platform = platform;
    }
    @Override
    void displayDetails(){
        System.out.println("Here is the platform information for Mobile Applcations");
    }
}
