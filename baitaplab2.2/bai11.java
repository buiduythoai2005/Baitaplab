package Lap2_2;

public class bai11 {
    static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6,7};
        int count = 0;
        for (int x : a)
            if (prime(x)) {
                System.out.print(x + " ");
                count++;
            }
        System.out.println("\nSố lượng: " + count);
    }
}
