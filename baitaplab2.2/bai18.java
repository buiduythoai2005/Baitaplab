package Lap2_2;

public class bai18 {
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int c = 0, p = 0;
        for (int i = 0; i < a.length; i++) {
            c += a[i][i];
            p += a[i][a.length - i - 1];
        }
        System.out.println("Chính: " + c);
        System.out.println("Phụ: " + p);
    }
}
