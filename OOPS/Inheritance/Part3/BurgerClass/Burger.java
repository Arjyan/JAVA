package OOPS.Inheritance.Part3.BurgerClass;


public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    //Constructor assigning value to supper class
    public Burger(String name,double price){
        super("BURGER", name, price);
    }

    //Added one addtional Name for this perticular class 
    @Override
    public String getName(){
        return super.getName()+ " BURGER";
    }

    //Overrriding method created so that we can adjust the final price through the super class
    @Override
    public double getAdjustedPrice(){
        return super.getMinimumPrice()+
        ((extra1==null) ? 0: extra1.getAdjustedPrice())+
        ((extra2==null) ? 0: extra2.getAdjustedPrice())+
        ((extra3==null) ? 0: extra3.getAdjustedPrice());
    }

    //Adding the price range for the toppings
    public double extraPrice(String toppingName){
        return switch(toppingName.toUpperCase()){
            case "CHEESE","ONION" -> 10.00;
            case "SILVER","GOLD" -> 30.00;
            default -> 0;
        };
    }

    //Creating objects and assigning it to the reference variable
    public void addTopping(String extra1,String extra2,String extra3){
        this.extra1=new Item("Topping", extra1, extraPrice(extra1));
        this.extra2=new Item("Topping", extra2, extraPrice(extra2));
        this.extra3=new Item("Topping", extra3, extraPrice(extra3));
    }

    //This will print the toppings and the price accordingly if any topping is available
    public void printToppingList(){
        printItem("NORMAL BURGER",getMinimumPrice());
        if (extra1!=null) {
            extra1.printItem();
        }
        if (extra2!=null) {
            extra2.printItem();
        }
        if (extra3!=null) {
            extra3.printItem();
        }
    }

    //This will print the topping list and the total price to pay
    @Override
    public void printItem(){
        printToppingList();
        System.out.println("-".repeat(50));
        super.printItem();
    }
}

