package animalPackage;

public class Dog extends Animal{

    public Dog(String name, int age, boolean isVaccinated){
        super(name, age, isVaccinated);
    }

    @Override
    public void calculateAdoptionFee(){
        adoptionFee = age * 20 + 150;
    }

    @Override
    public void generateCarePlan(){
        if (age<5){
            System.out.println("Need to exercises 2 hours per day");
        }else{
            System.out.println("1 hours exercise per day");
        }

        if(age<3){
            System.out.println("Need high-protein food");
        }else{
            System.out.println("Need balanced diet with supplements");
        }

        if(!isVaccinated){
            System.out.println("Recommended vaccination");
        }

    }

}


