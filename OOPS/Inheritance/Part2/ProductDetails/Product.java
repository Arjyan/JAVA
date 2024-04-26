package Part2.ProductDetails;

public class Product {
    private String model;
    private String manufacturer;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

 class Monitor extends Product {
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixel(int x,int y,String color){
        System.out.println("Drawing line on point"+x+" point "+y+" of color "+color);
    }
}

class Motherboard extends Product {
    private int ramSlot;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer,int ramSlot,int cardSlots,String bios){
        super(model, manufacturer);
        this.ramSlot=ramSlot;
        this.cardSlots=cardSlots;
        this.bios=bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is loading");
    }
}

class ComputerCase extends Product {
    private String powerSupply;

    public ComputerCase(String model, String manufacturer,String powerSupply){
        super(model, manufacturer);
        this.powerSupply=powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("pressing "+powerSupply+" power button...");
    }
}