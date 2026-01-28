package Lap3_1.bai6;

import java.util.Scanner;

public class bai6 {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập Name: ");
        name = sc.nextLine();
        System.out.print("Nhập Price: ");
        price = sc.nextDouble();
        System.out.print("Nhập Quantity: ");
        quantity = sc.nextInt();
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void discount(double percent) {
        price -= price * percent / 100;
    }

    public void display() {
        System.out.println(
                "id: " + id +
                        " – Name: " + name +
                        " – Price: " + price +
                        " – Quantity: " + quantity
        );
    }
}
