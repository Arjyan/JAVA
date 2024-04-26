public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        if (age<0||age>100){
            return 0;
        } else{
            return age;
        }
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public void setAge(int age){
        this.age=age;

    }

    public boolean isTeen(){
        if(age>12&&age<20){
            return true;
        } else{
            return false;
        }
    }

    public String getFullName(){

        if((firstName.isEmpty()==true) &&(lastName.isEmpty()==true)){
            return "";
        } else if(firstName.isEmpty()==true){
            return lastName;
        } else if(lastName.isEmpty()==true){
            return firstName;
        } else{
            return firstName+" "+lastName;
        }
    }
}