
import java.time.Year;

//Worker is the parent class.
public class Worker {
    protected String name;
    private int yearOfBirth;
    protected int endDate;

    // default constructor
    public Worker() {
        this("Null", 0, 0);
    }

    public Worker(String name, int yearOfBirth, int endDate) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.endDate = endDate;
    }

    public void getDetails() {
        System.out.println("Name= " + name);
        System.out.println("YearOfBirth= " + yearOfBirth);
        System.out.println("Employee age is " + getAge());
        System.out.println("EndYear= " + endDate);

    }

    // Getting the current year
    protected int year = Year.now().getValue();

    public int getAge() {
        return year - yearOfBirth;

    }

    public double monthlyPay() {
        return 0.0;
    }
}
