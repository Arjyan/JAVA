public class Animal {
    private String petName;
    private String petColor;

    public Animal(String petName, String petColor) {
        this.petName = petName;
        this.petColor = petColor;
    }

    public Animal(){}

    public void className() {
        String className = this.getClass().getSimpleName();
        if ( this instanceof Cat || this instanceof Dog || this instanceof Human) {
            System.out.println("\nThis is a " + className + " Its color is " + petColor.toUpperCase()
                    + " & its Name is " + petName.toUpperCase());
        } else{
            System.out.println("\t Error...");
        }

        // if (className == "Animal") {
        //     System.out.println("Error...");
        // } else {
        //     System.out.println("\nThis is a " + className + " Its color is " + petColor.toUpperCase()
        //             + " & its Name is " + petName.toUpperCase());
        // }
    }

    public static Animal getClassName(String className, String petName, String petColor) {
        if (className.toUpperCase().charAt(0) == 'D') {
            return new Dog(petName, petColor);
        } else if (className.toUpperCase().charAt(0) == 'C') {
            return new Cat(petName, petColor);
        } else if (className.toUpperCase().charAt(0) == 'H') {
            return new Human(petName, petColor);
        } else {
            System.out.println("\nYou have to enter a valid animal type i.e-Dog,Cat or Human.");
            return new Animal();
        }
    }
}

class Dog extends Animal {
    public Dog(String petName, String petColor) {
        super(petName, petColor);
    }

    @Override
    public void className() {
        super.className();
        System.out.println("\t Dog eats chicken.");
    }
}

class Cat extends Animal {
    public Cat(String petName, String petColor) {
        super(petName, petColor);
    }

    @Override
    public void className() {
        super.className();
        System.out.println("\t cat eats fish.");
    }
}

class Human extends Animal {
    public Human(String petName, String petColor) {
        super(petName, petColor);
    }

    @Override
    public void className() {
        super.className();
        System.out.println("\t Human eats everything.");
    }
}
