package Lap2_2;

public class bai4 {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        int max = a[0], cur = a[0];

        for (int i = 1; i < a.length; i++) {
            cur = Math.max(a[i], cur + a[i]);
            max = Math.max(max, cur);
        }
        System.out.println("Tổng lớn nhất: " + max);
    }
}
