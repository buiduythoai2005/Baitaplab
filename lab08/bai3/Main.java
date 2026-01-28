/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

/**
 * Bài 3: Interface Vehicle với default method
 * @author admin
 */

// ===== Interface Vehicle =====
interface Vehicle {

    // Phương thức trừu tượng: bắt buộc lớp implement phải định nghĩa
    void start();

    // Phương thức mặc định
    default void honk() {
        System.out.println("Beep beep!");
    }
}

// ===== Class Car =====
class Car implements Vehicle {

    // Chỉ cần override start()
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

// ===== Main class =====
public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car(); // đa hình

        car.start(); // gọi phương thức override
        car.honk();  // gọi default method
    }
}
