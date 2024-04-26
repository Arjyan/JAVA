
//Salaried employee is the sub class of Employee which is being inherited from Worker
public class SalariedEmployee extends Employee {

    private double annualSalary;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, int yearOfBirth, int hireYear, int endYear, double annualSalary) {
        super(name, yearOfBirth, hireYear, endYear);
        this.annualSalary = annualSalary;

    }

    @Override
    public double monthlyPay() {
        return (int) annualSalary / 12;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("AnnualSalary= " + annualSalary);
        boolean isRetired = retirementStatus(hireYear, endYear);
        System.out.println(isRetired ? name + " is retired " : name + " is not retired");

        if (isRetired == true) {
            annualSalary /= 2;
            System.out.println(name + "'s monthly salary is " + (int) monthlyPay());

        } else {
            System.out.println(name + "'s monthly salary is " + (int) monthlyPay());
        }
    }
}
