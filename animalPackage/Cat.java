package animalPackage;

public class Cat extends Animal{

    public Cat(String name, int age, boolean isVaccinated){
        super(name, age, isVaccinated);
    }

    @Override
    public void calculateAdoptionFee(){
        adoptionFee = age * 15 + 50;
    }

    @Override
    public void generateCarePlan(){
        if (age<4){
            System.out.println("Need to exercises 30 minutes per day");
        }else{
            System.out.println("15 minutes exercise per day");
        }

        if(age<2){
            System.out.println("Need kitchen food");
        }else{
            System.out.println("Need food with oil supplements");
        }

        if(!isVaccinated){
            System.out.println("Recommended vaccination");
        }

    }

}
