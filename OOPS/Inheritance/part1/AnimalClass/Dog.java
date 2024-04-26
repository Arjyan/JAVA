package AnimalClass;

public class Dog extends Animal {

    private String color;

    public Dog(String name, String type, String weight, String categorries) {

        super(name, type, weight, categorries);
    }

    public void color(String color) {
        this.color = color;
    }

    public void dogColor() {
        System.out.println("dog is of " + color + " color");
    }

}
