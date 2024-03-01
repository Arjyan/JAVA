public class flourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0, 1, 6));
    }

    // write code here
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal <= 0) {
            return false;
        } else {
            bigCount *= 5;
            if ((bigCount + smallCount) <= goal) {
                return true;
            } else {
                return false;
            }
        }
    }
}