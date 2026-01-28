package Lap3_1.bai8;

import java.util.Scanner;

public class bai8 {
    private String title;
    private String author;
    private double price;
    private int year;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Title: ");
        title = sc.nextLine();
        System.out.print("Nhập Author: ");
        author = sc.nextLine();
        System.out.print("Nhập Price: ");
        price = sc.nextDouble();
        System.out.print("Nhập Year: ");
        year = sc.nextInt();
    }

    public boolean isExpensive() {
        return price > 200_000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }

    public void display() {
        System.out.println(
                "Title: " + title +
                        " – Author: " + author +
                        " – Price: " + price +
                        " – Year: " + year
        );
    }
}
