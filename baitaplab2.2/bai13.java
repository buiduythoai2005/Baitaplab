package Lap2_2;
import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().replaceAll("\\s+", " ");
        String[] w = s.split(" ");
        String res = "";

        for (String x : w)
            res += x.substring(0,1).toUpperCase() + x.substring(1).toLowerCase() + " ";

        System.out.println(res.trim());
    }
}
