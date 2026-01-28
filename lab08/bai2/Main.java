/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

/**
 * Bài 2: Interface Shape
 * @author admin
 */

// ===== Interface Shape =====
interface Shape {

    // Hằng số PI (public static final mặc định)
    double PI = 3.14159;

    // Tính diện tích
    double calculateArea();

    // Tính chu vi
    double calculatePerimeter();
}

// ===== Class Rectangle =====
class Rectangle implements Shape {

    private double width;
    private double height;

    // Constructor khởi tạo chiều rộng và chiều cao
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Tính diện tích hình chữ nhật
    @Override
    public double calculateArea() {
        return width * height;
    }

    // Tính chu vi hình chữ nhật
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// ===== Main class =====
public class Main {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle(5, 3);

        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}
