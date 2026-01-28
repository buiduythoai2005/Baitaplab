/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai9;

/**
 * Bài 9: Sử dụng Interface
 * @author admin
 */

// ===== Interface Workable =====
interface Workable {
    void work(); // hành động làm việc
}

// ===== Interface Eatable =====
interface Eatable {
    void eat(); // hành động ăn
}

// ===== Interface Sleepable =====
interface Sleepable {
    void sleep(); // hành động ngủ
}

// ===== Class Human =====
class Human implements Workable, Eatable {

    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}

// ===== Class Robot =====
class Robot implements Workable {

    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

// ===== Class Android =====
class Android implements Workable, Eatable, Sleepable {

    @Override
    public void work() {
        System.out.println("Android is working");
    }

    @Override
    public void eat() {
        System.out.println("Android is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Android is sleeping");
    }
}

// ===== Main class =====
public class Main {

    // Hàm main: nơi chương trình bắt đầu chạy
    public static void main(String[] args) {

        // Mảng Workable thể hiện tính đa hình
        Workable[] workers = {
            new Human(),
            new Robot(),
            new Android()
        };

        // Gọi phương thức work() cho tất cả đối tượng
        for (Workable w : workers) {
            w.work();
        }

        System.out.println("-----");

        // Kiểm tra các hành vi khác
        Human human = new Human();
        human.eat();

        Android android = new Android();
        android.eat();
        android.sleep();
    }
}

