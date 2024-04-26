package Part2.ProductDetails;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("456", "Apple", 44, "4k");
        Motherboard motherboard = new Motherboard("scorpio", "intel", 2, 1, "Windows 11");
        ComputerCase computerCase = new ComputerCase("Flat", "Dell", "on");

        PersonalComputer myComputer = new PersonalComputer("pro book", "HP", monitor,
                motherboard, computerCase);

        myComputer.turnOnComputer();
    }
}
