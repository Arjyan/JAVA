package OOPS.Inheritance.Part3.Car;

import java.util.Scanner;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println(description + "\n Running cold start...");
    }

    public void drive() {

        // runEngine(kmPerLiter,tankSize,topSpeed);
        System.out.println("Driving...");
    }

    protected void runEngine(double kmPerLiter, String tankSize, String topSpeed) {
        System.out.println("Avg km is " + kmPerLiter + "\n Tank size " + tankSize + "\n Top speed " + topSpeed);
    }

    protected void runEngine(String kmPerCharge, String batterySize, String topSpeed) {
        System.out.println("Avg km is " + kmPerCharge + "\n Tank size " + batterySize + "\n Top speed " + topSpeed);
    }

    protected void runEngine(String kmPerLiter, String tankSize, String batterySize, String topSpeed) {
        System.out.println("Avg km is " + kmPerLiter + "\n Tank size  " + tankSize + "\n Battery size " + batterySize
                + "\n Top speed " + topSpeed);
    }

    public static Car returnInstance(String value) {
        Scanner sc = new Scanner(System.in);
        if (value.toUpperCase().charAt(0) == 'P') {
            System.out.println("you have choosed Petrol car");
            System.out.println("\nEnter km Per liter");
            double kmPerLiter = sc.nextDouble();

            System.out.println("Tank size");
            String tankSize= sc.next();

            System.out.println("Enter top speed");
            String topSpeed = sc.next();

            return new Petrol(kmPerLiter, tankSize, topSpeed);

        } else if (value.toUpperCase().charAt(0) == 'D') {
            System.out.println("you have chosed Diesel car");
            System.out.println("\nEnter km Per liter");
            double kmPerLiter = sc.nextDouble();

            System.out.println("Tank size");
            String tankSize = sc.next();

            System.out.println("Enter top speed");
            String topSpeed = sc.next();

            return new Diesel(kmPerLiter, tankSize, topSpeed);

        } else if (value.toUpperCase().charAt(0) == 'C') {
            System.out.println("you have choosed Cng car");
            System.out.println("\nEnter km Per liter");
            double kmPerLiter = sc.nextDouble();

            System.out.println("Tank size");
            String tankSize = sc.next();

            System.out.println("Enter top speed");
            String topSpeed = sc.next();

            return new Cng(kmPerLiter, tankSize, topSpeed);

        } else if (value.toUpperCase().charAt(0) == 'E') {
            System.out.println("you have choosed Electric car");
            System.out.println("Enter km Per full charge");
            String kmPerLiter = sc.nextLine();

            System.out.println("Battary size");
            String tankSize = sc.nextLine();

            System.out.println("Enter top speed");
            String topSpeed = sc.nextLine();

            return new Electric(kmPerLiter, tankSize, topSpeed);
        } else if (value.toUpperCase().charAt(0) == 'H') {
            System.out.println("you have choosed Hybrid car");
            System.out.println("Enter km Per full charge");
            String kmPerLiter = sc.nextLine();

            System.out.println("Battary size");
            String battarySize = sc.nextLine();

            System.out.println("Enter tank size");
            String tankSize = sc.nextLine();

            System.out.println("Enter top speed");
            String topSpeed = sc.nextLine();

            return new Hybrid(kmPerLiter, battarySize, tankSize, topSpeed);
        } else {
            return new Car("Something went wrong...");
        }

    }
}

// Petrol CAR
class Petrol extends Car {
    private double kmPerLiter;
    private String tankSize;
    private String topSpeed;

    public Petrol(double kmPerLiter, String tankSize, String topSpeed) {
        super("This is a Petrol car");
        this.kmPerLiter = kmPerLiter;
        this.tankSize = tankSize;
        this.topSpeed = topSpeed;
    }

    // @Override
    public void runEngine() {
        super.runEngine(kmPerLiter, tankSize, topSpeed);
    }
}

// Diesel CAR
class Diesel extends Car {
    private double kmPerLiter;
    private String tankSize;
    private String topSpeed;

    public Diesel(double kmPerLiter, String tankSize, String topSpeed) {
        super("This is a Diesel car");
        this.kmPerLiter = kmPerLiter;
        this.tankSize = tankSize;
        this.topSpeed = topSpeed;
    }

    // @Override
    public void runEngine() {
        super.runEngine(kmPerLiter, tankSize, topSpeed);
    }
}

// Cng CAR
class Cng extends Car {
    private double kmPerLiter;
    private String tankSize;
    private String topSpeed;

    public Cng(double kmPerLiter, String tankSize, String topSpeed) {
        super("This is a CNG car");
        this.kmPerLiter = kmPerLiter;
        this.tankSize = tankSize;
        this.topSpeed = topSpeed;
    }

    // @Override
    public void runEngine() {
        super.runEngine(kmPerLiter, tankSize, topSpeed);
    }
}

// Electric CAR
class Electric extends Car {
    private String kmPerCharge;
    private String batterySize;
    private String topSpeed;

    public Electric(String kmPerCharge, String batterySize, String topSpeed) {
        super("This is a Electric car");
        this.kmPerCharge = kmPerCharge;
        this.batterySize = batterySize;
        this.topSpeed = topSpeed;
    }

    // @Override
    public void runEngine() {
        super.runEngine(kmPerCharge, batterySize, topSpeed);
    }
}

// Hybrid CAR
class Hybrid extends Car {
    private String kmPerLiter;
    private String tankSize;
    private String batterySize;
    private String topSpeed;

    public Hybrid(String kmPerLiter, String tankSize, String batterySize, String topSpeed) {
        super("This is a Hybrid car");
        this.kmPerLiter = kmPerLiter;
        this.tankSize = tankSize;
        this.batterySize = batterySize;
        this.topSpeed = topSpeed;
    }

    // @Override
    protected void runEngine() {
        super.runEngine(kmPerLiter, tankSize, batterySize, topSpeed);
    }
}