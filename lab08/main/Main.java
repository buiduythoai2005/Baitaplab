/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 * Chương trình quản lý phương tiện giao thông
 * @author admin
 */

// ===== Interface Movable =====
interface Movable {

    // Phương thức trừu tượng: bắt buộc các lớp implement phải định nghĩa
    void move();

    // Phương thức mặc định: lớp implement có thể dùng luôn hoặc override
    default void stop() {
        System.out.println("Stopping"); // Dừng phương tiện theo cách mặc định
    }
}

// ===== Interface FuelConsumable =====
interface FuelConsumable {

    // Trả về mức tiêu thụ nhiên liệu của phương tiện
    double getFuelConsumption();
}

// ===== Interface ElectricChargeable =====
interface ElectricChargeable {

    // Phương thức sạc điện cho phương tiện chạy điện
    void charge();
}

// ===== Class Car =====
class Car implements Movable, FuelConsumable {

    // Mô tả hành động di chuyển của ô tô
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    // Trả về lượng nhiên liệu tiêu thụ của ô tô
    @Override
    public double getFuelConsumption() {
        return 8.5; // ví dụ: 8.5 lít / 100km
    }
}

// ===== Class Bicycle =====
class Bicycle implements Movable {

    // Mô tả hành động di chuyển của xe đạp
    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }

    // Ghi đè phương thức stop() để thể hiện cách dừng riêng của xe đạp
    @Override
    public void stop() {
        System.out.println("Using brakes");
    }
}

// ===== Class ElectricCar =====
class ElectricCar implements Movable, FuelConsumable, ElectricChargeable {

    // Mô tả hành động di chuyển của xe điện
    @Override
    public void move() {
        System.out.println("Electric car is moving");
    }

    // Xe điện không tiêu thụ nhiên liệu xăng/dầu
    @Override
    public double getFuelConsumption() {
        return 0;
    }

    // Thực hiện sạc điện cho xe
    @Override
    public void charge() {
        System.out.println("Charging electric car");
    }
}

// ===== Main class =====
public class Main {

    // Hàm main: điểm bắt đầu chạy chương trình
    public static void main(String[] args) {

        // Tạo mảng Movable chứa nhiều loại phương tiện khác nhau (đa hình)
        Movable[] vehicles = {
            new Car(),
            new Bicycle(),
            new ElectricCar()
        };

        // Duyệt qua từng phương tiện
        for (Movable v : vehicles) {

            // Gọi hành động di chuyển
            v.move();

            // Gọi hành động dừng (đa hình)
            v.stop();

            System.out.println("-----");
        }
    }
}

