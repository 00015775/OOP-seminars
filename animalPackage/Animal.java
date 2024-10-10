package animalPackage;

abstract class Animal {
    String name;
    int age;
    boolean isVaccinated;
    double adoptionFee;

    public Animal(String name, int age, boolean isVaccinated){
        this.name = name;
        this.age= age;
        this.isVaccinated = isVaccinated;
    }
    public void displayInfo(){
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("isVaccinated: " + isVaccinated);
        generateCarePlan();
        calculateAdoptionFee();
    }
    abstract void calculateAdoptionFee();
    abstract void generateCarePlan();
}
