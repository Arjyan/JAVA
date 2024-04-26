import java.util.Scanner;

public class paintJob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("If you dont know how many buckets You have Enter '0' or Press '1'");
        int exit=Integer.parseInt(input.nextLine());
        int exitForFirstFunction=1;
        if (exit==0) {
            System.out.println("If you dont know height and Width of the work Enter '0' again or Press '1'");
            exitForFirstFunction=Integer.parseInt( input.nextLine());
            if (exitForFirstFunction==0) {

                System.out.println("Enter total Area (It also takes Double value)");
                double area=Double.parseDouble(input.nextLine());

                System.out.println("Enter area per bucket (It also takes Double value)");
        double inputAreaPerBucket = Double.parseDouble(input.nextLine());

        System.out.println("Total number of "+ getBucketCount(area,inputAreaPerBucket) +" to complete this work");
            }else{
                System.out.println("Enter width (It also takes double values)");
                double inputWidth= Double.parseDouble(input.nextLine());

                System.out.println("Enter Height (It also takes double values)");
                double inputHeight= Double.parseDouble(input.nextLine());

                System.out.println("Enter area per bucket");
                double inputAreaPerBucket= Double.parseDouble(input.nextLine());

                System.out.println("You need Total "+getBucketCount(inputWidth,inputHeight,inputAreaPerBucket)+" number of buckets to complete this work");
            }
            
        }else{

        System.out.println("Enter width (It also takes Double value)");
        double inputWidth = Double.parseDouble(input.nextLine());

        System.out.println("enter Height (It also takes Double value)");
        double inputHeight = Double.parseDouble(input.nextLine());

        System.out.println("Enter area per bucket (It also takes Double value)");
        double inputAreaPerBucket = Double.parseDouble(input.nextLine());

        System.out.println("Enter no of buckets You have (It only takes Integer value)");
        int inputExtaraBuckets = Integer.parseInt(input.nextLine());

        System.out.println(
                "You require more " + getBucketCount(inputWidth, inputHeight, inputAreaPerBucket, inputExtaraBuckets)
                        + " Bukets of paint to finish the job");
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            double totalArea = height * width;
            // useing Math.ceil function so that the number will be a round value
            double totalBucket = Math.ceil(totalArea / areaPerBucket);

            double requiredBuckets = totalBucket - extraBuckets;
            // converting double to integer for method return type
            int intRequiredBuckets = (int) requiredBuckets;
            return intRequiredBuckets;

        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double totalArea = width * height;
            double totalBucket = totalArea / areaPerBucket;
            // rounding the total bucket and doing implicit type casting
            int roundOfTotalBucket = (int) Math.ceil(totalBucket);
            return roundOfTotalBucket;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            double totalBucket = area / areaPerBucket;
            // converting double to integer for return type
            int intTotalbucket = (int) Math.ceil(totalBucket);
            return intTotalbucket;
        }
    }
}
