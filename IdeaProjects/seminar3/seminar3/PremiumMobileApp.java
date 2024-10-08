public class PremiumMobileApp extends MobileApp{
    PremiumMobileApp(String name,String version, String platform){
        super(name,version,platform);
    }

    void supportDuration(int number){
        System.out.println("Duration of support: "+ number);
    }
    @Override
    void displayDetails(){
        System.out.println("Displaying information about the duration of support.");
    }
}