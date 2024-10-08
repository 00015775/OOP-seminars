public class SoftwareProduct {
    String name;
    String version;
    SoftwareProduct(String name, String version){
        this.name = name;
        this.version = version;
    }
    void displayDetails(){
        System.out.println("Software name: "+ name + "\nSoftware version: "+ version);
    }
}
