/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

/**
 * Bài 4: Interface Shape có static method
 * @author admin
 */

// ===== Interface Shape =====
interface Shape {

    double PI = 3.14159;

    double calculateArea();
    double calculatePerimeter();

    // Static method trong interface
    static String getInfo() {
        return "This is a shape";
    }
}

// ===== Class Rectangle =====
class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

// ===== Main class =====
public class Main {

    public static void main(String[] args) {

        // Gọi static method từ interface
        System.out.println(Shape.getInfo());

        Rectangle rect = new Rectangle(4, 6);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}

