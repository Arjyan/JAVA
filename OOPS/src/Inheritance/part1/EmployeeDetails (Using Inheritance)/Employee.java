
import java.time.Year;

//Employee is being inheritated from Worker
public class Employee extends Worker {

    private long employeeId;
    protected int hireYear;
    protected int endYear;
    private int currentYear = Year.now().getValue();

    private static long empNo = 1;

    public Employee() {
        super();
    }

    public boolean retirementStatus(int hireYear, int endYear) {
        if (endYear == currentYear) {
            System.out.println("Employee is retiring in this Year");
            return false;
        } else if (hireYear > currentYear) {
            System.out.println("Please Enter a valid Year");
            return true;
        } else if (endYear < currentYear) {
            return true;
        } else {
            return false;
        }
    }

    public Employee(String name, int yearOfBirth, int hireYear, int endYear) {
        super(name, yearOfBirth, endYear);
        this.employeeId = empNo++;
        this.hireYear = hireYear;
        this.endYear = endYear;
    }

    public Employee(String name, int yearOfBirth) {
        super(name, yearOfBirth, 0);
        this.employeeId = empNo++;
    }

    @Override
    public void getDetails() {
        System.out.println("Eid= " + employeeId);
        System.out.println("Hire Year= " + hireYear);
        super.getDetails();
    }
}
