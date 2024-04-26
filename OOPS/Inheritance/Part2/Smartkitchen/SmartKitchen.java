package Part2.Smartkitchen;

public class SmartKitchen {
    private Refrigerator icebox;
    private DishWasher dishWasher;
    private CoffeeMaker brewMaster;

    public SmartKitchen() {
        icebox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaster = new CoffeeMaker();
    }

    public Refrigerator getRefrigerator() {
        return icebox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeeMaker() {
        return brewMaster;
    }

    public void setKitchenState(boolean icebox, boolean dishWasher, boolean brewMaster) {
        this.icebox.setHasWorkToDo(icebox);
        this.dishWasher.setHasWorkToDo(dishWasher);
        this.brewMaster.setHasWorkToDo(brewMaster);
    }

    public void doPendingWork(){
        icebox.orderFood();
        dishWasher.doDishes();
        brewMaster.brewCoffee();
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("ordering food");

        }
        hasWorkToDo = false;
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("washing dishes");
        }
        hasWorkToDo = false;
    }

}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("making coffee...");
        }
        hasWorkToDo = false;
    }
}
