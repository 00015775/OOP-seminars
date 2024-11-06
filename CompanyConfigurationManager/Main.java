package CompanyConfigurationManager;

public class Main {
    public static void main(String[] args){
        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();

        configurationManager1.setCompanyName("John");
        configurationManager2.setCompanyName("Doe");

        System.out.println(configurationManager1.getCompanyName());
        System.out.println(configurationManager2.getCompanyName());
        System.out.println("Are both the same: "+ (configurationManager1==configurationManager2)); // TRUE


    }
}
