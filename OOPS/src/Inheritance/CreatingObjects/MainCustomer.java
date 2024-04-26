public class MainCustomer {
    public static void main(String[] args) {
        Customer firstCustomer=new Customer("Arjyan",500,"arjyan@wipro");

        System.out.println(firstCustomer.getName());
        System.out.println(firstCustomer.getCreditLimit());
        System.out.println(firstCustomer.getEmailAddress());
        System.out.println("---------------");

        Customer secondCustomer= new Customer("Tim","tim@wipro.com");

        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());
        System.out.println("---------------");

        Customer thirdCustomer=new Customer();

        System.out.println(thirdCustomer.getName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
    }
}
