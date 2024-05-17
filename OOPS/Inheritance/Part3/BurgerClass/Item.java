package OOPS.Inheritance.Part3.BurgerClass;


public class Item {
    private String type;
    private String name;
    private double price;
    private String size="SMALL";

    //Constructor without assiging Size variable
    public Item(String type, String name,double price){
        this.type=type.toUpperCase();
        this.name=name.toUpperCase();
        this.price=price;
    }

    //Setting the Size variable for additional usecases
    public void setSize(String size){
        this.size =size.toUpperCase();
    }

    //Extracting the name variable with some testcases
    public String getName(){
        if (type.equals("DRINK") || type.contains("SIDE")) {
            return size+" "+name;
        }
        return name;
    }

    //Extracting the current price value
    public double getMinimumPrice(){
        return price;
    } 

    //getting the final price after adding all the details
    public double getAdjustedPrice(){
        return switch(size){
            case "LARGE" -> getMinimumPrice()+30.99;
            case "MEDIUM"-> getMinimumPrice()+20.99;
            default -> getMinimumPrice();
        };
    }

    //Getting output for costum input
    public static void printItem(String name,double price){
        System.out.printf("%30s : %3.2f\n",name,price);
    }

    //Getting output for default input
    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
}
