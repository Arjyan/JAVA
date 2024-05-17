package OOPS.Inheritance.Part3.BurgerClass;


public class Main {
    public static void main(String[] args) {

        Burger chickenBurger= new Burger("Chicken", 130);
        chickenBurger.addTopping("gold", "onion", "cheese");
        chickenBurger.printItem();   

        MealOrder regularMeal= new MealOrder();
        regularMeal.addBurgerToppings("Onion", "cheese", "mayo");
        regularMeal.setDrinkSize("large");
        regularMeal.getTotalAmount();

        MealOrder secondMeal= new MealOrder("chicken", "thumps up", "nachos");
        secondMeal.addBurgerToppings("cheese", "egg", "mayo");
        secondMeal.setDrinkSize("medium");
        secondMeal.getTotalAmount();

        MealOrder deluxMeal= new MealOrder("delux", "Sprit", "Chilli");
        deluxMeal.addBurgerToppings("cheese", "tomato", "mayo","Gold","Silver");
        deluxMeal.setDrinkSize("small");
        deluxMeal.getTotalAmount();
    }
}
