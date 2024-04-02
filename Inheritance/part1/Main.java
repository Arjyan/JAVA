package part1;

public class Main {

    public static void main(String args[]) {
        // code for testing the inheritance of animal class
        Animal newAnimal = new Animal("testName", "testType", "33.5kg", "testAnimalType");

        newAnimal.speed(50);

        newAnimal.animalDetails(newAnimal);

        System.out.println("-------------------------");
        // code for running the child class inheritate from the parent class
        Dog shera = new Dog("Shera", "dalmatian", "55kg", "Dog");

        shera.color("black");
        shera.speed(60);
        shera.animalDetails(shera);
        shera.dogColor();
    }
}