import java.util.Scanner;
public class readingUserInputChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int totalNumber = 5;
        boolean testCase = false;
        int counter = 0;
        int number=1;
        do {

            while(number<=totalNumber) {
                try {
                    System.out.println("Enter number #" + number);
                    counter = Integer.parseInt(sc.nextLine());
                    testCase = validation(counter);
                   if (testCase==true) {
                    number++;
                    sum += counter;
                   } 
                } catch (NumberFormatException textInput) {
                    System.out.print("(Enter a number not a charecter) ");

                }
            }

        } while (!testCase);



        System.out.println("Sum of total number is " + sum);
    }

    public static boolean validation(int counter) {
        if (counter <= 0) {
            System.out.println("(negative Number not allowed)");
            System.out.println("");
            return false;
        } else {
            return true;
        }
    }
}