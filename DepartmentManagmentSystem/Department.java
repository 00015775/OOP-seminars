package DepartmentManagmentSystem;

import java.util.ArrayList;

public class Department implements IComponent{
    private String name;
    private ArrayList<IComponent> components = new ArrayList<>();

    Department(String name){
        this.name = name;
    }

    public void addComponent(IComponent component){
        components.add(component);
    }

    public void removeComponent(IComponent component){
        components.remove(component);
    }

    @Override
    public void displayInfo() {
        System.out.println("\nDepartment: " + name);
        for(IComponent component: components){
            component.displayInfo();
        }
    }
}