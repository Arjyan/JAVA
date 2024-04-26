
//Hourly employee is the sub class of Employee which is being inherited from Worker
public class HourlyEmployee extends Employee {
    private double hourlyPayRate;
    private double totalHours;
    private String name;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, int yearOfBirth, double hourlyPayRate, double totalHours) {
        super(name, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
        this.totalHours = totalHours;
        this.name = name;
    }

    @Override
    public double monthlyPay() {
        return totalHours * hourlyPayRate;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println(name + " is a contractual employee");
        System.out.println(
                "The amount of " + (int) monthlyPay() + " will be pay after completion of " + totalHours + " Hours");
    }
}
