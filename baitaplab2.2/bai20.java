package Lap2_2;
import java.util.Random;
import java.util.Scanner;
public class bai20 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100) + 1;

        for (int i = 1; i <= 7; i++) {
            int g = sc.nextInt();
            if (g == num) {
                System.out.println("Đúng!");
                return;
            }
            System.out.println(g > num ? "Lớn hơn" : "Nhỏ hơn");
        }
        System.out.println("Thua! Số là: " + num);
    }
}
