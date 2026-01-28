package Lap2_2;

public class bai9 {
    public static void main(String[] args) {
        int[] a = {5,2,9,1};
        for (int i = 0; i < a.length-1; i++)
            for (int j = i+1; j < a.length; j++)
                if (a[i] > a[j]) {
                    int t = a[i]; a[i] = a[j]; a[j] = t;
                }
        for (int x : a) System.out.print(x + " ");
    }
}
