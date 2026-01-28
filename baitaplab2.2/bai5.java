package Lap2_2;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(rev) ? "Palindrome" : "Không phải");
    }
}
