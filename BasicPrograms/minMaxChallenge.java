import java.util.Scanner;

public class minMaxChallenge {
    public static void main(String args[]) {
        // This try method is recomended by vs code
        try (Scanner sc = new Scanner(System.in)) {
            boolean check = true;

            double maxNumber = 0;
            double minNumber = 0;
            // System.out.println(input);
            try {
                System.out.println("Enter a number to start");
                double previousInput = Double.parseDouble(sc.nextLine());
                maxNumber = previousInput;
                minNumber = previousInput;
                while (check) {

                    System.out.println("Input a number");
                    double input = Double.parseDouble(sc.nextLine());
                    if (input < previousInput && input < minNumber) {
                        minNumber = input;
                        previousInput = input;
                    }
                    if (input > previousInput && input > maxNumber) {
                        maxNumber = input;
                        previousInput = input;
                    }
                }

            } catch (java.lang.NumberFormatException charecterError) {
                System.out.println("You have terminated the programe");
                System.out.println("Maximum Number is " + maxNumber + " Minimum number is " + minNumber);
                check = false;
            }
        }
    }
}
