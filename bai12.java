package Lap2_1;import java.util.Scanner;
public class bai12 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) a[i] = sc.nextInt();

    int max = a[0], min = a[0];
    for (int i = 1; i < n; i++) {
        if (a[i] > max) max = a[i];
        if (a[i] < min) min = a[i];
    }

    System.out.println("Max = " + max);
    System.out.println("Min = " + min);
    sc.close();
}
}
