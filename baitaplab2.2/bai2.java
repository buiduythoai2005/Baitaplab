package Lap2_2;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        int[] count = new int[256];
        for (char c : s.toCharArray())
            count[c]++;

        for (int i = 0; i < 256; i++)
            if (count[i] > 0)
                System.out.println((char)i + ": " + count[i]);
    }
}
