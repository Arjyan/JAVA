
public class Main {
    public static void main(String[] args) {

        // Worker Object
        Worker newWorker = new Worker("Arjyan", 2002, 2036);

        System.out.println("Employee age = " + newWorker.getAge());
        ;

        // Employee Object
        Employee newEmployee = new Employee("Tim", 1986, 2002, 2035);
        newEmployee.getDetails();

        System.out.println("---------------------");
        Employee number2 = new Employee("Akshya", 1990, 20019, 2025);
        number2.getDetails();

        System.out.println("----Salaried Employee----"); // Salaried Employee object
        SalariedEmployee number3 = new SalariedEmployee("Arjyan", 2002, 2020, 2026, 600000.4500);
        number3.getDetails();

        System.out.println("----------------");
        SalariedEmployee Sonali = new SalariedEmployee("Sonali", 2002, 2023, 2030, 500000);
        Sonali.getDetails();

        // Object Salaried Employee
        System.out.println("---------------");
        SalariedEmployee rohit = new SalariedEmployee("Rohit", 1999, 2020, 2039, 3000000);

        rohit.getDetails();
        System.out.println("");
        SalariedEmployee mohit = new SalariedEmployee("Mohit", 1985, 2020, 2023, 2500000);
        mohit.getDetails();

        SalariedEmployee biswajit = new SalariedEmployee("Biswajit", 2002, 2024, 2025, 200000);
        biswajit.getDetails();

        // Object of Hourly Employee
        System.out.println("-----Hourly Employee------");

        HourlyEmployee ramesha = new HourlyEmployee("Ramesh", 1985, 2000, 40);
        ramesha.getDetails();

        System.out.println("");
        HourlyEmployee kara = new HourlyEmployee("Kara", 1990, 1500.8, 26.4);
        kara.getDetails();

    }
}
