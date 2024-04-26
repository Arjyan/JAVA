package AnimalClass;
public class Animal {
    private String name;
    private String type;
    private String weight;
    private int speed;
    private String categorries;

    public Animal(String name, String type, String weight, String categorries) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.categorries = categorries;
    }

    public void speed(int speed) {
        this.speed = speed;
    }

    public void animalDetails(Animal animal) {
        System.out.println("The " + animal.categorries + " name is " + animal.name);
        System.out.println(" & it is a type of " + animal.type);
        System.out.println("It's weight is " + animal.weight);
        System.out.println("It can run at a speed of " + animal.speed);
    }
}
