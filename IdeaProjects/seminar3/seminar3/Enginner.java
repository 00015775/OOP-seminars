public class Enginner extends Employee{
    String specialization;
    Enginner(String name, String department, String specialization) {
        super(name, department);
        this.specialization = specialization;
    }
    @Override
    void displayInfo() {
       System.out.println("Specialization: "+ specialization);
       super.displayInfo();
    }

}
