package Lap3_1.bai3;

import java.util.Scanner;

public class bai3 {
    private String ID;
    private String Name;
    private double luong;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        ID = sc.nextLine();

        System.out.print("Nhập Name: ");
        Name = sc.nextLine();

        System.out.print("Nhập lương: ");
        luong = sc.nextDouble();
    }

    public double tinhThue() {
        if (luong > 10_000_000) {
            return luong * 0.10;
        }
        return 0;
    }

    public void display() {
        System.out.println(
                "ID: " + ID +
                        " – Name: " + Name +
                        " – Salary: " + luong
        );
        System.out.println("Thuế phải nộp: " + tinhThue());
    }
}
