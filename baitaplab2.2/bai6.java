package Lap2_2;

public class bai6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,2,2,4,1};
        int maxCount = 0, value = a[0];

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j : a)
                if (j == a[i]) count++;
            if (count > maxCount) {
                maxCount = count;
                value = a[i];
            }
        }
        System.out.println(value + " xuất hiện " + maxCount + " lần");
    }
}
