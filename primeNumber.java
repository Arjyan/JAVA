public class primeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (checkPrime(i) == true) {
                count--;

                System.out.print(i+" ");
            }
        }
        System.out.println("Total "+ count);
    }

    public static boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
