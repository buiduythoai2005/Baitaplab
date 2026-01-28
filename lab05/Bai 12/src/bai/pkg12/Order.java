/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg12;

public class Order {
    private String orderId;
    private Product product; // HAS-A Product

    public Order(String orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
    }

    public double getTotal() {
        return product.getPrice();
    }
}

