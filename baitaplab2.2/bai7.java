package Lap2_2;
import java.util.ArrayList;
public class bai7 {
    public class Bai7 {
        public static void main(String[] args) {
            int[] a = {1, 2, 3};
            int[] b = {2, 3, 4};
            ArrayList<Integer> list = new ArrayList<>();

            for (int x : a) if (!list.contains(x)) list.add(x);
            for (int x : b) if (!list.contains(x)) list.add(x);

            System.out.println(list);
        }
    }
}
