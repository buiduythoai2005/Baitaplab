package Lap2_2;
import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if (s.isEmpty()) System.out.println(0);
        else System.out.println(s.split("\\s+").length);
    }
}
