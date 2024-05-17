package OOPS.Arrays;

import java.util.Scanner;
public class MinimulelementChallenge {
   public static void main(String[] args) {
    // minValue(convertingToArray());
    System.out.println(minValue(convertingToArray()));
   }

   private static int[] convertingToArray(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter all the integers separatin with (,)");
    String input= sc.nextLine();
    String[] splitedInput=input.split(",");

    int[] integerArray= new int[splitedInput.length];
            for(int i=0;i<integerArray.length;i++){
                integerArray[i]=Integer.parseInt(splitedInput[i].trim());
            }
        return integerArray;
   }

   private static String minValue(int[] input){
    int minValue=input[0];
    for (int element : input){
        if (element<minValue) {
            minValue=element;
        }
    }

    return "minimum value is "+minValue;
   }
}
