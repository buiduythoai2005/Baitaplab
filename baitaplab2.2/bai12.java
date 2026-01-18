package Lap2_2;

public class bai12 {
    static int sumDigit(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a = {12, 345, 7};
        for (int x : a)
            System.out.println(x + " -> " + sumDigit(x));
    }
}
