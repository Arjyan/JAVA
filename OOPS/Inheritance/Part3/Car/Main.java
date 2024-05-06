package OOPS.Inheritance.Part3.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter car type Petrol,Diesel,Cng,Electric,Hybrid");
            String carType = sc.nextLine();

            // Car.carDetails(carType);

            if (carType.toUpperCase().charAt(0) == 'P') {
                Petrol car = (Petrol) Car.returnInstance(carType);
                car.startEngine();
                car.runEngine();
                car.drive();
            } else if (carType.toUpperCase().charAt(0) == 'D') {
                Diesel car = (Diesel) Car.returnInstance(carType);
                car.startEngine();
                car.runEngine();
                car.drive();
            } else if (carType.toUpperCase().charAt(0) == 'C') {
                Cng car = (Cng) Car.returnInstance(carType);
                car.startEngine();
                car.runEngine();
                car.drive();
            } else if (carType.toUpperCase().charAt(0) == 'E') {
                Electric car = (Electric) Car.returnInstance(carType);
                car.startEngine();
                car.runEngine();
                car.drive();
            } else if (carType.toUpperCase().charAt(0) == 'H') {
                Hybrid car = (Hybrid) Car.returnInstance(carType);
                car.startEngine();
                car.runEngine();
                car.drive();
            } else {
                System.out.println(carType.toUpperCase() + " is not defined.");
                break;
            }
        }

        // if (carType.toUpperCase().charAt(0) == 'E' ) {
        // Electric electricCar = new Electric(350, 300, 250);
        // electricCar.startEngine();
        // electricCar.runEngine();
        // electricCar.drive();
        // System.out.println("-".repeat(20));
        // } else if (carType.toUpperCase().charAt(0) == 'H') {
        // Hybrid hybridCar = new Hybrid(60, 30, 100, 220);
        // hybridCar.startEngine();
        // hybridCar.runEngine();
        // hybridCar.drive();
        // System.out.println("-".repeat(20));
        // } else if (carType.toUpperCase().charAt(0) == 'C') {
        // Cng cngCar = new Cng(40, 25, 150);
        // cngCar.startEngine();
        // cngCar.runEngine();
        // cngCar.drive();
        // System.out.println("-".repeat(20));
        // } else if (carType.toUpperCase().charAt(0) == 'D') {
        // Diesel dieselCar = new Diesel(20, 35, 200);
        // dieselCar.startEngine();
        // dieselCar.runEngine();
        // dieselCar.drive();
        // System.out.println("-".repeat(20));
        // } else if (carType.toUpperCase().charAt(0) == 'P') {
        // Petrol petrolCar = new Petrol(15, 30, 220);
        // petrolCar.startEngine();
        // petrolCar.runEngine();
        // petrolCar.drive();
        // System.out.println("-".repeat(20));
        // }
        // else {
        // System.out.println(carType.toUpperCase() + " is not defined.");
        // break;
        // }

        // Petrol petrolCar= new Petrol(15, 30, 220);
        // petrolCar.startEngine();
        // petrolCar.runEngine();
        // petrolCar.drive();

        // System.out.println("-".repeat(20));

        // Diesel dieselCar=new Diesel(20, 35, 200);
        // dieselCar.startEngine();
        // dieselCar.runEngine();
        // dieselCar.drive();

        // System.out.println("-".repeat(20));

        // Electric electricCar= new Electric(350, 300, 250);
        // electricCar.startEngine();
        // electricCar.runEngine();
        // electricCar.drive();

        // System.out.println("-".repeat(20));

        // Cng cngCar= new Cng(40, 25, 150);
        // cngCar.startEngine();
        // cngCar.runEngine();
        // cngCar.drive();

        // System.out.println("-".repeat(20));

        // Hybrid hybridCar= new Hybrid(60, 30, 100, 220);
        // hybridCar.startEngine();
        // hybridCar.runEngine();
        // hybridCar.drive();

        // System.out.println("-".repeat(20));
    }
}
