package DepartmentManagmentSystem;

public class Main {
    public static void main(String[] args){
        Employee john = new Employee("John");
        Employee sarah = new Employee("Sarah");
        Employee kyle = new Employee("Kyle");
        Employee mike = new Employee("Mike");

        Department accounting = new Department("Accounting");
        Department sales = new Department("Sales");
        Department management = new Department("Management");

        accounting.addComponent(john);
        accounting.addComponent(sarah);

        sales.addComponent(kyle);
        sales.addComponent(mike);

        management.addComponent(accounting);
        management.addComponent(sales);

        management.displayInfo(); //Inside the management department there are other departments of sales and accounting


    }
}
