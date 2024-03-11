public class Customer{
    private String name;
    private double creditLimit;
    private String email;

    public Customer(){
        this("No name","No email");
        System.out.println("Empty constructor called");
    }

    public Customer(String name,String email){
        this(name,0,email);
        // this.name=name;
        // this.email=email;
        System.out.println("constructor having 2 parameters called");
    }

    public Customer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
        System.out.println("constructor having 3 parameters called");
    }

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return email;
    }
}