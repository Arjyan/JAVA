package OOPS.Inheritance.Part3.BurgerClass;


public class DeluxBurger extends Burger{
    Item delux1;
    Item delux2;

    //Delux burger constructor
    public DeluxBurger(String name,double price){
        super(name, price);
    }

    //calling the topping method on super class with 5 parameter
    public void addTopping(String extra1,String extra2,String extra3,String extra4,String extra5){
        super.addTopping(extra1, extra2, extra3);
        delux1= new Item("topping", extra4, 10.50);
        delux2= new Item("topping", extra5, 10.50);
    }

    //Check if delux instance is present
    @Override
    public void printToppingList(){
        super.printToppingList();
        if (delux1!=null) {
            delux1.printItem();
        }
        if (delux2!=null) {
            delux2.printItem();
        }
    }

    //Setting the additional topping price to 0
    @Override
    public double extraPrice(String toppingName){
        return 0;

    }
}
