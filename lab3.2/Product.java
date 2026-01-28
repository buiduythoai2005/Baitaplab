package Lap3_2.bai6;
import java.util.Scanner;
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.print("Nhập giá: ");
        price = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        quantity = sc.nextInt();
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void discount(double percent) {
        price = price - price * percent / 100;
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
