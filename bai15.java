package Lap2_1;import java.util.Scanner;
public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double sum = 0, max = -1;
        String maxName = "";

        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            double score = sc.nextDouble();
            sc.nextLine();

            sum += score;
            if (score > max) {
                max = score;
                maxName = name;
            }
        }

        System.out.println("Điểm TB = " + sum / n);
        System.out.println("SV cao nhất: " + maxName + " (" + max + ")");
        sc.close();
    }
}
