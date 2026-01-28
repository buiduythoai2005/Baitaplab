package Lap2_1;import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("Số chẵn");
        else
            System.out.println("Số lẻ");

        sc.close();
    }
}
