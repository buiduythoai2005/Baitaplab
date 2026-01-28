/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinhhoc1;

/**
 *
 * @author admin
 */

// ===== LỚP TRỪU TƯỢNG SHAPE =====
abstract class Shape {
    String name; // tên hình

    // constructor
    public Shape(String name) {
        this.name = name;
    }

    // phương thức trừu tượng tính diện tích
    abstract double area();

    // hiển thị thông tin
    void display() {
        System.out.println("Tên hình: " + name);
        System.out.println("Diện tích: " + area());
    }
}

// ===== HÌNH CHỮ NHẬT =====
class Rectangle extends Shape {
    double width;   // chiều rộng
    double height;  // chiều cao

    public Rectangle(double width, double height) {
        super("Hình chữ nhật");
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// ===== HÌNH TRÒN =====
class Circle extends Shape {
    double radius; // bán kính

    public Circle(double radius) {
        super("Hình tròn");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// ===== HÀM MAIN =====
public class Main {

    public static void main(String[] args) {

        // Tạo các hình
        Shape h1 = new Rectangle(4, 5);
        Shape h2 = new Rectangle(3, 6);
        Shape h3 = new Circle(3);

        // Lưu vào mảng Shape
        Shape[] shapes = { h1, h2, h3 };

        // Duyệt danh sách và hiển thị
        for (Shape s : shapes) {
            s.display();
            System.out.println("------------------");
        }
    }
}

