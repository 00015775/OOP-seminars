package CompanyConfigurationManager;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String companyName;
    private double taxRate;
    private boolean operationalMode;

    private ConfigurationManager(){
        companyName = null;
        taxRate = 0.00;
        operationalMode = false;
    };

    public static ConfigurationManager getInstance(){
        if(instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public boolean isOperationalMode() {
        return operationalMode;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setOperationalMode(boolean operationalMode) {
        this.operationalMode = operationalMode;
    }
}
