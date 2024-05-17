package OOPS.Inheritance.Part3.BurgerClass;


public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item sideItem;

    //creating default constructor for adding values for custome constructor
    public MealOrder(){
        this("total", "COKE", "FRIES");
    }

    //Setting all the variable details using constructor
    public MealOrder(String burger,String drink,String sideItem){
        if (burger.equalsIgnoreCase("delux")) {
            this.burger=new DeluxBurger(burger, 180.99);
        } else{
            this.burger= new Burger(burger, 119.99);
        }
        this.drink= new Item("drink", drink, 40.99);
        this.sideItem=new Item("Side Item", sideItem, 80.50);
    }

    //This will only get the total bill
    public double getOnlyTotalAmount(){
        if (burger instanceof DeluxBurger) {
            return burger.getAdjustedPrice();
        }
        return burger.getAdjustedPrice()+drink.getAdjustedPrice()+sideItem.getAdjustedPrice();
    }

    //This will give breakout of price and the toatl amount to pay 
    public void getTotalAmount(){
        burger.printItem();
        if (burger instanceof DeluxBurger) {
            Item.printItem(drink.getName(), 40);
            Item.printItem(sideItem.getName(), 50);
        } else{
            drink.printItem();
            sideItem.printItem();
        }
        System.out.println("-".repeat(50));
        Item.printItem("TOTAL AMOUNT ", getOnlyTotalAmount());
    }

    //This will add toppings and will evaluate the price accordingly
    public void addBurgerToppings(String extra1,String extra2,String extra3){
        burger.addTopping(extra1, extra2, extra3);
    }

    //Adding method for the delux burger toppings
    public void addBurgerToppings(String extra1,String extra2,String extra3,String extra4,String extra5){
        if (burger instanceof DeluxBurger db) {
            db.addTopping(extra1, extra2, extra3,extra4,extra5);
        } else{
            burger.addTopping(extra1, extra2, extra3);

        }
    }

    //This will set the drink size in the Item class
    public void setDrinkSize(String size){
        drink.setSize(size);
    }
}
