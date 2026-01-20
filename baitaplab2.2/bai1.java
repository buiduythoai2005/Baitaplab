package Lap2_2;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ten = new String[n];
        double[] diem = new double[n];
        double tong = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Tên SV: ");
            ten[i] = sc.nextLine();
            System.out.print("Điểm: ");
            diem[i] = sc.nextDouble();
            sc.nextLine();
            tong += diem[i];
        }

        System.out.println("Điểm trung bình: " + tong / n);
        System.out.println("Sinh viên đạt:");
        for (int i = 0; i < n; i++)
            if (diem[i] >= 5)
                System.out.println(ten[i]);

        System.out.println("Sinh viên không đạt:");
        for (int i = 0; i < n; i++)
            if (diem[i] < 5)
                System.out.println(ten[i]);
    }
}
