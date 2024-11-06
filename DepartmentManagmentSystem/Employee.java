package DepartmentManagmentSystem;

public class Employee implements IComponent{
    private String name;

    Employee(String name){
        this.name = name;
    }

    @Override
    public void displayInfo() {
        System.out.println("Employee: "+ name);
    }
}
