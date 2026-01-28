package Lap2_2;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        boolean upper=false, lower=false, digit=false, special=false;
        if (p.length() >= 8)
            for (char c : p.toCharArray()) {
                if (Character.isUpperCase(c)) upper = true;
                else if (Character.isLowerCase(c)) lower = true;
                else if (Character.isDigit(c)) digit = true;
                else special = true;
            }

        System.out.println(upper && lower && digit && special ? "Mạnh" : "Yếu");
    }
}
