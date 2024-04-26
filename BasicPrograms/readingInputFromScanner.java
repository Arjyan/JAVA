
//Importing Scanner Class from util
import java.util.Scanner;

public class readingInputFromScanner {
    public static void main(String[] args) {
        try (// Creating a object in scanner class
        Scanner sc = new Scanner(System.in)) {
            int year = 2024;
            boolean validDob = false;
            System.out.println("What is your name");

            // Taking input from Scanner object(sc)
            String name = sc.nextLine();
            System.out.println("Hi," + name);

            do {
                System.out.println("Enter your Date of birth");
                try {
                    validDob = validation(year, sc.nextLine());
                } catch (NumberFormatException stringInputError) {
                    System.out.println("charecter is not allowed");
                }

            } while (!validDob);
        }

    }

    public static boolean validation(int currentYear, String dob) {
        int dobInInt = Integer.parseInt(dob);
        int minYear = currentYear - 125;

        if ((dobInInt < minYear) || (dobInInt >= currentYear)) {
            System.out.println("Enter a date < " + currentYear + " Or >= " + minYear);
            return false;
        } else {
            int currentAge = currentYear - dobInInt;
            System.out.println("So you are " + currentAge + " Year old");
            return true;
        }
    }
}
