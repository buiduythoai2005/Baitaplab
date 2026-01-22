package Lap3_2.bai8;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    private int year;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tiêu đề: ");
        title = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        author = sc.nextLine();
        System.out.print("Nhập giá: ");
        price = sc.nextDouble();
        System.out.print("Nhập năm xuất bản: ");
        year = sc.nextInt();
    }

    public void display() {
        System.out.println(
                "Title: " + title +
                        " – Author: " + author +
                        " – price: " + price +
                        " – Year: " + year
        );
    }

    public boolean isExpensive() {
        return price > 200000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }
}
