package Lap2_2;

public class bai19 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
}
