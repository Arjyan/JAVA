package Part2.Smartkitchen;

public class Main {
    public static void main(String args[]) {
        SmartKitchen newKitchen = new SmartKitchen();

        newKitchen.getRefrigerator().setHasWorkToDo(true);
        newKitchen.getCoffeeMaker().setHasWorkToDo(true);
        newKitchen.getDishWasher().setHasWorkToDo(true);

        newKitchen.getRefrigerator().orderFood();
        newKitchen.getCoffeeMaker().brewCoffee();
        newKitchen.getDishWasher().doDishes();

        System.out.println("-".repeat(18));

        newKitchen.setKitchenState(true, true, false);
        newKitchen.doPendingWork();

    }
}

