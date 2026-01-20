package Lap2_1;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều dài: ");
        int d = sc.nextInt();
        System.out.print("Chiều rộng: ");
        int r = sc.nextInt();

        System.out.println("Chu vi = " + 2 * (d + r));
        System.out.println("Diện tích = " + d * r);
        sc.close();
    }
}
