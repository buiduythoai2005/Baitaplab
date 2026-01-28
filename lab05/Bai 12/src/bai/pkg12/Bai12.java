/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.pkg12;

public class Bai12 {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 15000000);
        Order o = new Order("OD01", p);

        System.out.println("Tổng tiền đơn hàng: " + o.getTotal());
    }
}

