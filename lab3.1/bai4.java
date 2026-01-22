package Lap3_1.bai4;

import java.util.Scanner;

public class bai4 {
    private double radius;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Radius: ");
        radius = sc.nextDouble();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isBigCircle() {
        return getArea() > 100;
    }
}
