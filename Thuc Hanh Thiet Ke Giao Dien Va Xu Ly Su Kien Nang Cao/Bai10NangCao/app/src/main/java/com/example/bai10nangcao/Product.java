package com.example.bai10nangcao;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " - " + quantity + " x " + price + " = " + getTotal() + " VNĐ";
    }
}
