/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinhhoc2;

/**
 *
 * @author admin
 */

// ===== LỚP TRỪU TƯỢNG =====
abstract class GeometricObject {

    // Tính diện tích
    abstract double getArea();

    // Tính chu vi
    abstract double getPerimeter();

    // Hiển thị thông tin
    void show() {
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }
}

// ===== HÌNH CHỮ NHẬT =====
class Rectangle extends GeometricObject {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }
}

// ===== HÌNH VUÔNG =====
class Square extends GeometricObject {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }
}

// ===== HÌNH TRÒN =====
class Circle extends GeometricObject {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// ===== MAIN =====
public class Main {

    public static void main(String[] args) {

        // Tạo nhiều đối tượng hình học
        GeometricObject[] shapes = {
            new Rectangle(4, 6),
            new Square(5),
            new Circle(3)
        };

        // In diện tích và chu vi từng hình
        for (GeometricObject shape : shapes) {
            System.out.println("----- HÌNH HỌC -----");
            shape.show();
            System.out.println();
        }
    }
}
