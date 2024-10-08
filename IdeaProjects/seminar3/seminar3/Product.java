public class Product {
    // package-private, only accessible within the same package
    String name;
    double price;

    // default constructor
    Product(){
        name = "unknown";
        price = 0.0;
    }
    //Product(String name, double price){
      //  this.name = name;
        //this.price = price;
    //}

    void displayInfo(){
        System.out.println("Product : "+ name + "\nPrice: " + price);
    }
}
