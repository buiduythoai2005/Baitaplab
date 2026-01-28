package Lap2_2;
import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] w = sc.nextLine().split(" ");
        for (String x : w)
            System.out.print(new StringBuilder(x).reverse() + " ");
    }
}
