public class Employee {
    String name;
    String department;
    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    void displayInfo(){
        System.out.println("Employee name: " + name + "\nDepartment: "+ department);
    }
}
