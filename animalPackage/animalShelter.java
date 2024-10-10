package animalPackage;

public class animalShelter {
    public static void main(String[] args){
        Animal[] animals = {
                new Dog("Buddy", 20, true),
                new Dog("Max", 17, false),
                new Cat("Whiskers", 22, true),
                new Cat("Shadow", 15, false),
        };
        for(Animal animal: animals){
            animal.displayInfo();
        }
    }
}

