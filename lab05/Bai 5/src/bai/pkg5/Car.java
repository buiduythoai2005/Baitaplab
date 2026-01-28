/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai.pkg5;

public class Car {
    private String brand;
    private String color;
    private Engine engine; // HAS-A Engine

    public Car(String brand, String color, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }

    public void display() {
        System.out.println("----- THÔNG TIN XE -----");
        System.out.println("Hãng xe: " + brand);
        System.out.println("Màu sắc: " + color);
        engine.display();
    }
}
