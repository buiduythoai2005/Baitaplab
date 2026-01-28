package Lap2_1;import java.util.Scanner;
public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String dao = "";

        for (int i = s.length() - 1; i >= 0; i--)
            dao += s.charAt(i);

        System.out.println(dao);
        sc.close();
    }
}
