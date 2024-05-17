package OOPS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DecendingOrderArrayScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = sc.nextInt();

        sortIntegers(getIntegers(arraySize));
        // System.out.println(Arrays.toString(sortIntegers(getIntegers(arraySize))));
    }

    public static int[] getIntegers(int arraySize) {
        int[] array = new int[arraySize];
        System.out.println("Enter numbers");
        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            int arrayInput = sc.nextInt();
            array[i] = arrayInput;
        }
        return array;
    }

    public static int[] sortIntegers(int[] unsortedArray){
         Arrays.sort(unsortedArray);

            int counter= unsortedArray.length-1;
            int[] sortedArray=new int[unsortedArray.length];

            for (int i=0;i<unsortedArray.length;i++) {
                sortedArray[i]=unsortedArray[counter];
                System.out.println("Element "+i+" contents "+sortedArray[i]);
                counter--;
            }

        return sortedArray;
    }
}
