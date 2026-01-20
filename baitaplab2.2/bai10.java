package Lap2_2;

public class bai10 {
    public static void main(String[] args) {
        int[] a = {5,5,3,2};
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > max) {
                second = max;
                max = x;
            } else if (x > second && x != max) {
                second = x;
            }
        }
        System.out.println(second == Integer.MIN_VALUE ? "Không tồn tại" : second);
    }
}
