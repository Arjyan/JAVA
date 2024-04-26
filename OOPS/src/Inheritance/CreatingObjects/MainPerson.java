public class MainPerson {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
person.setFirstName("Arjyan");   // firstName is set to empty string
person.setLastName("Bibhushan");    // lastName is set to empty string
person.setAge(10);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setFirstName("John");    // firstName is set to John
person.setAge(18);
System.out.println("fullName= " + person.getFullName());
System.out.println("teen= " + person.isTeen());
person.setLastName("Smith");    // lastName is set to Smith
System.out.println("fullName= " + person.getFullName());


    }
}
