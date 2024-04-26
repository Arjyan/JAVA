package Part2.ProductDetails;

public class PersonalComputer extends Product {
    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;
 
    public PersonalComputer(String model, String manufacturer,
          Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
       super(model, manufacturer);
       this.monitor = monitor;
       this.motherboard = motherboard;
       this.computerCase = computerCase;
    }
 
    public void turnOnComputer(){
       computerCase.pressPowerButton();
       runProgame();
    }
 
    private void runProgame(){
       motherboard.loadProgram("Git Hub");
    }
 }
 