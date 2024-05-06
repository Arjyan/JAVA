import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Animal animal1 = new Dog("Snoopy", "Black");
        // animal1.className();

        // Animal animal2 = new Cat("shani", "golden");
        // animal2.className();

        Scanner sc=new Scanner(System.in);
        while (true) {
            
            System.out.println("-".repeat(100));
            System.out.println("Enter C for Cat, D for Dog, H for Human or Q for quit");
        String animalType= sc.nextLine();
        if ("Qq".contains(animalType)) {
            break;
        }
        System.out.println("Enter animal name");
        String animalName=sc.nextLine();
        System.out.println("Enter animal color");
        String animalColor=sc.nextLine();
        Animal animal=Animal.getClassName(animalType,animalName,animalColor);
        animal.className();

        }
    }
}


