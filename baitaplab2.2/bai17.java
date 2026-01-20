package Lap2_2;

public class bai17 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.print("Chẵn: ");
        for (int x : a) if (x % 2 == 0) System.out.print(x + " ");
        System.out.print("\nLẻ: ");
        for (int x : a) if (x % 2 != 0) System.out.print(x + " ");
    }
}
